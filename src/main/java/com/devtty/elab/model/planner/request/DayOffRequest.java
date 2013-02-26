package com.devtty.elab.model.planner.request;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.ShiftDate;
import javax.persistence.OneToOne;

@Entity
public class DayOffRequest extends AbstractPersistable{
	
	private Employee employee;
	private ShiftDate shiftDate;
	private int weight;

	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@OneToOne(optional = false)
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
		return "DayOffRequest [employee=" + employee + ", shiftDate="
				+ shiftDate + "]";
	}
	
	
}
