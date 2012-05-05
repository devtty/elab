package com.devtty.elab.model.planner;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.contract.Contract;

@Entity
public class Employee extends AbstractPersistable{
	
	private String code;
	private String name;
	private Contract contract;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	@Transient
	public int getWeekendLength(){
		return getContract().getWeekendLength();
	}

}
