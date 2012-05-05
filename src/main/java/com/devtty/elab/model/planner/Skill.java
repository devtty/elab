package com.devtty.elab.model.planner;

import javax.persistence.Entity;

import com.devtty.elab.model.common.AbstractPersistable;

@Entity
public class Skill extends AbstractPersistable{
	
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

}
