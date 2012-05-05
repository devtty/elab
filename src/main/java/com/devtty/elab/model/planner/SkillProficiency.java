package com.devtty.elab.model.planner;

import com.devtty.elab.model.common.AbstractPersistable;

public class SkillProficiency extends AbstractPersistable{
	
	private Employee employee;
	private Skill skill;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
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
