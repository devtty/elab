package com.devtty.elab.model.planner.contract;

import com.devtty.elab.model.planner.Pattern;

public class PatternContractLine extends ContractLine{
	
	private Contract contract;
	private Pattern pattern;
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
