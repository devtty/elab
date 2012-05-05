package com.devtty.elab.model.planner;

import javax.persistence.Entity;

import com.devtty.elab.model.common.AbstractPersistable;

@Entity
public class Project extends AbstractPersistable{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	
}
