package com.devtty.elab.model.planner.solver;

import java.io.Serializable;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.contract.Contract;

public class EmployeeConsecutiveWeekendAssignmentStart implements Comparable<EmployeeConsecutiveWeekendAssignmentStart>, Serializable{

	private Employee employee;
	private int sundayIndex;
	
	public EmployeeConsecutiveWeekendAssignmentStart(Employee employee, int sundayIndex){
		this.employee = employee;
		this.sundayIndex = sundayIndex;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getSundayIndex() {
		return sundayIndex;
	}

	public void setSundayIndex(int sundayIndex) {
		this.sundayIndex = sundayIndex;
	}

	public boolean equals(Object o){
		if(this == o){
			return true;
		}else if(o instanceof EmployeeConsecutiveWeekendAssignmentStart){
			EmployeeConsecutiveWeekendAssignmentStart other = (EmployeeConsecutiveWeekendAssignmentStart) o;
			return new EqualsBuilder()
			.append(employee, other.employee)
			.append(sundayIndex, other.sundayIndex)
			.isEquals();
		}else{
			return false;
		}
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(employee)
		.append(sundayIndex)
		.toHashCode();
	}
	
	public int compareTo(EmployeeConsecutiveWeekendAssignmentStart other){
		return new CompareToBuilder()
		.append(employee, other.employee)
		.append(sundayIndex, other.sundayIndex)
		.toComparison();
	}

	@Override
	public String toString() {
		return "EmployeeConsecutiveWeekendAssignmentStart [employee=" + employee
				+ ", sundayIndex=" + sundayIndex + "]";
	}
	
	public Contract getContract(){
		return employee.getContract();
	}
}
