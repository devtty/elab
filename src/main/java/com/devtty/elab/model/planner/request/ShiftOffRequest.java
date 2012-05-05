package com.devtty.elab.model.planner.request;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.Shift;

public class ShiftOffRequest extends AbstractPersistable{
	
	private Employee employee;
	private Shift shift;
	private int weight;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Shift getShift() {
		return shift;
	}
	public void setShift(Shift shift) {
		this.shift = shift;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "ShiftOffRequest [employee=" + employee + ", shift=" + shift
				+ "]";
	}
	
	

}
