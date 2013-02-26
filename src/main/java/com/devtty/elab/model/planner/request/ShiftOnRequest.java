package com.devtty.elab.model.planner.request;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.Shift;
import javax.persistence.OneToOne;

@Entity
public class ShiftOnRequest extends AbstractPersistable{

	private Employee employee;
	private Shift shift;
	private int weight;
	
	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@OneToOne(optional = false)
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
		return "ShiftOnRequest [employee=" + employee + ", shift=" + shift
				+ "]";
	}
	
	
	
}
