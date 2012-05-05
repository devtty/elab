package com.devtty.elab.model.planner;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.devtty.elab.model.common.AbstractPersistable;

@Entity
public class ShiftDate extends AbstractPersistable{

	private int dayIndex;
	private String dateString;
	private DayOfWeek dayOfWeek;
	
	private List<Shift> shiftList;

	public int getDayIndex() {
		return dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@OneToMany(mappedBy="shiftDate")
	public List<Shift> getShiftList() {
		return shiftList;
	}

	public void setShiftList(List<Shift> shiftList) {
		this.shiftList = shiftList;
	}
	
	@Transient
	public String getLabel(){
		return dateString.substring(5);
	}
	
	@Override
	public String toString(){
		return dateString + "(" + dayOfWeek + ")";
	}
	
	@Transient
	public int getWeekendSundayIndex(){
		switch(dayOfWeek){
		case MONDAY : return dayIndex - 1;
		case TUESDAY : return dayIndex - 2;
		case WEDNESDAY : return dayIndex - 3;
		case THURSDAY : return dayIndex + 3;
		case FRIDAY : return dayIndex + 2;
		case SATURDAY : return dayIndex + 1;
		case SUNDAY : return dayIndex;
		default:
			throw new IllegalArgumentException("The dayOfWeek (" + dayOfWeek + ") is not valid");
		}
	}
}
