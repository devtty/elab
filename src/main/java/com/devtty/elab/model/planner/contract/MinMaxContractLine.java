package com.devtty.elab.model.planner.contract;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class MinMaxContractLine extends ContractLine{

	private boolean minimumEnabled;
	private int minimumValue;
	private int minimumWeight;
	
	private boolean maximumEnabled;
	private int maximumValue;
	private int maximumWeight;
	
	@org.hibernate.annotations.Type(type="true_false")
	@NotNull
	public boolean isMinimumEnabled() {
		return minimumEnabled;
	}
	public void setMinimumEnabled(boolean minimumEnabled) {
		this.minimumEnabled = minimumEnabled;
	}
	
	public int getMinimumValue() {
		return minimumValue;
	}
	public void setMinimumValue(int minimumValue) {
		this.minimumValue = minimumValue;
	}
	
	public int getMinimumWeight() {
		return minimumWeight;
	}
	public void setMinimumWeight(int minimumWeight) {
		this.minimumWeight = minimumWeight;
	}
	
	@org.hibernate.annotations.Type(type="true_false")
	@NotNull
	public boolean isMaximumEnabled() {
		return maximumEnabled;
	}
	public void setMaximumEnabled(boolean maximumEnabled) {
		this.maximumEnabled = maximumEnabled;
	}
	
	public int getMaximumValue() {
		return maximumValue;
	}
	public void setMaximumValue(int maximumValue) {
		this.maximumValue = maximumValue;
	}
	
	public int getMaximumWeight() {
		return maximumWeight;
	}
	public void setMaximumWeight(int maximumWeight) {
		this.maximumWeight = maximumWeight;
	}
	
	@Transient
	public boolean isEnabled(){
		return minimumEnabled || maximumEnabled;
	}
	
}
