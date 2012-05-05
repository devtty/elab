package com.devtty.elab.model.planner.solver;

import java.io.Serializable;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.devtty.elab.model.planner.DayOfWeek;
import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.ShiftDate;
import com.devtty.elab.model.planner.WeekendDefinition;
import com.devtty.elab.model.planner.contract.Contract;

public class EmployeeConsecutiveAssignmentEnd implements Comparable<EmployeeConsecutiveAssignmentEnd>, Serializable{

	private Employee employee;
	private ShiftDate shiftDate;
	
	public EmployeeConsecutiveAssignmentEnd(Employee employee, ShiftDate shiftDate){
		this.employee = employee;
		this.shiftDate = shiftDate;
	}

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
	
	public boolean equals(Object o){
		if(this == o){
			return true;
		}else if(o instanceof EmployeeConsecutiveAssignmentEnd){
			EmployeeConsecutiveAssignmentEnd other = (EmployeeConsecutiveAssignmentEnd) o;
			return new EqualsBuilder()
			.append(employee, other.employee)
			.append(shiftDate, other.shiftDate)
			.isEquals();
		}else{
			return false;
		}
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(employee)
		.append(shiftDate)
		.toHashCode();
	}
	
	public int compareTo(EmployeeConsecutiveAssignmentEnd other){
		return new CompareToBuilder()
		.append(employee, other.employee)
		.append(shiftDate, other.shiftDate)
		.toComparison();
	}

	@Override
	public String toString() {
		return "EmployeeConsecutiveAssignmentEnd [employee=" + employee
				+ ", shiftDate=" + shiftDate + "]";
	}
	
	public Contract getContract(){
		return employee.getContract();
	}
	
	public int getShiftDateDayIndex(){
		return shiftDate.getDayIndex();
	}
	
	public boolean isWeekendAndNotLastDayOfWeekend(){
		WeekendDefinition weekendDefinition = employee.getContract().getWeekendDefinition();
		DayOfWeek dayOfWeek = shiftDate.getDayOfWeek();
		return weekendDefinition.isWeekend(dayOfWeek) && weekendDefinition.getLastDayOfWeekend() != dayOfWeek;
	}
	
	public int getDistanceToLastDayOfWeekend(){
		WeekendDefinition weekendDefinition = employee.getContract().getWeekendDefinition();
		DayOfWeek dayOfWeek = shiftDate.getDayOfWeek();
		return dayOfWeek.getDistanceToNext(weekendDefinition.getLastDayOfWeekend());
	}

}
