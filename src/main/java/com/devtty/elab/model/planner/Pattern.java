package com.devtty.elab.model.planner;

import javax.persistence.Entity;

import com.devtty.elab.model.common.AbstractPersistable;

public abstract class Pattern extends AbstractPersistable{
	
	protected String code;
	protected int weight;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return code;
	}

}
