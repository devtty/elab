package com.devtty.elab.model.planner;

public class WorkBeforeFreeSequencePattern extends Pattern{
	
	private DayOfWeek workDayOfWeek;
	private ShiftType workShiftType;
	
	private int freeDayLength;
	
	public DayOfWeek getWorkDayOfWeek() {
		return workDayOfWeek;
	}
	public void setWorkDayOfWeek(DayOfWeek workDayOfWeek) {
		this.workDayOfWeek = workDayOfWeek;
	}
	public ShiftType getWorkShiftType() {
		return workShiftType;
	}
	public void setWorkShiftType(ShiftType workShiftType) {
		this.workShiftType = workShiftType;
	}
	
	public int getFreeDayLength(){
		return freeDayLength;
	}
	
	public void setFreeDayLength(int freeDayLength){
		this.freeDayLength = freeDayLength;
	}
	@Override
	public String toString() {
		return "WorkBeforeFreeSequencePattern [workDayOfWeek=" + workDayOfWeek
				+ ", workShiftType=" + workShiftType + ", freeDayLength="
				+ freeDayLength + "]";
	}
	
	

}
