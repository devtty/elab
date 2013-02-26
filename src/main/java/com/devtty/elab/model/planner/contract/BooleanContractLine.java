package com.devtty.elab.model.planner.contract;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class BooleanContractLine extends ContractLine{
	
	private boolean enabled;
	private int weight;
	
	@org.hibernate.annotations.Type(type="true_false")
	@NotNull
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
