package com.devtty.elab.model.planner;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.devtty.elab.model.common.AbstractPersistable;

@Entity
public class Shift extends AbstractPersistable{

	private ShiftDate shiftDate;
	private ShiftType shiftType;
	private int index;
	
	private int requiredEmployeeSize;

	@ManyToOne
	public ShiftDate getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(ShiftDate shiftDate) {
		this.shiftDate = shiftDate;
	}

	@ManyToOne
	public ShiftType getShiftType() {
		return shiftType;
	}

	public void setShiftType(ShiftType shiftType) {
		this.shiftType = shiftType;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getRequiredEmployeeSize() {
		return requiredEmployeeSize;
	}

	public void setRequiredEmployeeSize(int requiredEmployeeSize) {
		this.requiredEmployeeSize = requiredEmployeeSize;
	}
	
	@Transient
	public String getLabel(){
		return shiftDate.getLabel() + " - " + shiftType.getCode();
	}
	
	@Override
	public String toString(){
		return shiftDate + "_" + shiftType;
	}
	
}
