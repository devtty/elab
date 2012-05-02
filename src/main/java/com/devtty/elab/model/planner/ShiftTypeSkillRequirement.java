package com.devtty.elab.model.planner;

import com.devtty.elab.model.common.AbstractPersistable;

public class ShiftTypeSkillRequirement extends AbstractPersistable{
	
	private ShiftType shiftType;
	private Skill skill;
	public ShiftType getShiftType() {
		return shiftType;
	}
	public void setShiftType(ShiftType shiftType) {
		this.shiftType = shiftType;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	@Override
	public String toString(){
		return shiftType + "-" + skill;
	}

}
