package com.devtty.elab.model.planner.contract;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.Pattern;

//@Entity
public class PatternContractLine extends AbstractPersistable{
	
	private Contract contract;
	private Pattern pattern;
	
	//@ManyToOne
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	@Override
	public String toString() {
		return "PatternContractLine [contract=" + contract + ", pattern="
				+ pattern + "]";
	}
	
	

}
