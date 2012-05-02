package com.devtty.elab.model.planner.request;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.ShiftDate;

public class DayOnRequest extends AbstractPersistable{
	
	private Employee employee;
	private ShiftDate shiftDate;
	private int weight;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public ShiftDate getShiftDate() {
		return shiftDate;
	}
	public void setShiftDate(ShiftDate shiftDate) {
		this.shiftDate = shiftDate;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "DayOnRequest [employee=" + employee + ", shiftDate="
				+ shiftDate + "]";
	}
	
	
	

}
