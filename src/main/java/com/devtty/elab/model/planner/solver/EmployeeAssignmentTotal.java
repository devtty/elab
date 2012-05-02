package com.devtty.elab.model.planner.solver;

import java.io.Serializable;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.devtty.elab.model.planner.Employee;
import com.devtty.elab.model.planner.contract.Contract;

public class EmployeeAssignmentTotal implements Comparable<EmployeeAssignmentTotal>, Serializable{
	
	private Employee employee;
	private int total;
	
	public EmployeeAssignmentTotal(Employee employee, int total){
		this.employee = employee;
		this.total = total;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public boolean equals(Object o){
		if(this == o){
			return true;
		}else if(o instanceof EmployeeAssignmentTotal){
			EmployeeAssignmentTotal other = (EmployeeAssignmentTotal) o;
			return new EqualsBuilder().append(employee, other.employee)
			.append(total, other.total)
			.isEquals();
		}else{
			return false;
		}
	}
	
	public int hashCode(){
		return new HashCodeBuilder().append(employee).append(total).toHashCode();
	}
	
	public int compareTo(EmployeeAssignmentTotal other){
		return new CompareToBuilder()
		.append(employee, other.employee)
		.append(total, other.total)
		.toComparison();
	}

	@Override
	public String toString() {
		return "EmployeeAssignmentTotal [employee=" + employee + ", total="
				+ total + "]";
	}
	
	public Contract getEmployeeContract(){
		return employee.getContract();
	}
	

}
