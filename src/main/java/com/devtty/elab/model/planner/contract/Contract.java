package com.devtty.elab.model.planner.contract;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.WeekendDefinition;

@Entity
public class Contract extends AbstractPersistable{
	
	private String code;
	private String description;
	private WeekendDefinition weekendDefinition;
	
	private List<ContractLine> contractLineList;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WeekendDefinition getWeekendDefinition() {
		return weekendDefinition;
	}

	public void setWeekendDefinition(WeekendDefinition weekendDefinition) {
		this.weekendDefinition = weekendDefinition;
	}

	@OneToMany(mappedBy="contract")
	public List<ContractLine> getContractLineList() {
		return contractLineList;
	}

	public void setContractLineList(List<ContractLine> contractLineList) {
		this.contractLineList = contractLineList;
	}

	@Override
	public String toString() {
		return "Contract [code=" + code + "]";
	}
	
	@Transient
	public int getWeekendLength(){
		return weekendDefinition.getWeekendLength();
	}

}
