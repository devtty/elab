package com.devtty.elab.model.planner;

import javax.persistence.Entity;

import com.devtty.elab.model.common.AbstractPersistable;

//@Entity
public class RosterInfo extends AbstractPersistable{

	private ShiftDate firstShiftDate;
	private ShiftDate lastShiftDate;
	
	public RosterInfo(ShiftDate firstShiftDate, ShiftDate lastShiftDate){
		this.firstShiftDate = firstShiftDate;
		this.lastShiftDate = lastShiftDate;
	}

	public ShiftDate getFirstShiftDate() {
		return firstShiftDate;
	}

	public void setFirstShiftDate(ShiftDate firstShiftDate) {
		this.firstShiftDate = firstShiftDate;
	}

	public ShiftDate getLastShiftDate() {
		return lastShiftDate;
	}

	public void setLastShiftDate(ShiftDate lastShiftDate) {
		this.lastShiftDate = lastShiftDate;
	}
	
	@Override
	public String toString(){
		return firstShiftDate + " - " + lastShiftDate;
	}
	
	public int getFirstShiftDateDayIndex(){
		return firstShiftDate.getDayIndex();
	}
	
	public int getLastShiftDateDayIndex(){
		return lastShiftDate.getDayIndex();
	}
	
}
