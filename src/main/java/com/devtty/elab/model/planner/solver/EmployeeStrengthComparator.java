package com.devtty.elab.model.planner.solver;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

import com.devtty.elab.model.planner.Employee;

public class EmployeeStrengthComparator implements Comparator<Employee>, Serializable{

	public int compare(Employee a, Employee b){
		return new CompareToBuilder()
		.append(b.getWeekendLength(), a.getWeekendLength())
		.append(a.getId(), b.getId())
		.toComparison();
	}
	
}
