package com.devtty.elab.model.planner;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.devtty.elab.model.common.AbstractPersistable;

@Entity
public class SkillProficiency extends AbstractPersistable{
	
	private Employee employee;
	private Skill skill;
	
	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@ManyToOne
	public Skill getSkill() {
		return skill;
	}
	
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	@Override
	public String toString() {
		return "SkillProficiency [employee=" + employee + ", skill=" + skill
				+ "]";
	}
	
	

}
