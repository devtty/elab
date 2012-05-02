package com.devtty.elab.model.planner.contract;

import com.devtty.elab.model.common.AbstractPersistable;

public class ContractLine extends AbstractPersistable{

	private Contract contract;
	private ContractLineType contractLineType;
	
	
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
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
