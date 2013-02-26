package com.devtty.elab.model.planner.contract;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.devtty.elab.model.common.AbstractPersistable;
import javax.persistence.DiscriminatorColumn;
import static javax.persistence.DiscriminatorType.STRING;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = STRING)
public abstract class ContractLine extends AbstractPersistable{

	private Contract contract;
	private ContractLineType contractLineType;
	
	@ManyToOne
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	@Enumerated(EnumType.STRING)
	public ContractLineType getContractLineType() {
		return contractLineType;
	}
	public void setContractLineType(ContractLineType contractLineType) {
		this.contractLineType = contractLineType;
	}
	
	@Override
	public String toString() {
		return "ContractLine [contract=" + contract + "]";
	}
	
	
	
}
