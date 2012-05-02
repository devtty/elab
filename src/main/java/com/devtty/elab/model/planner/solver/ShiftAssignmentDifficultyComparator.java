package com.devtty.elab.model.planner.solver;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

import com.devtty.elab.model.planner.Shift;
import com.devtty.elab.model.planner.ShiftAssignment;

public class ShiftAssignmentDifficultyComparator implements Comparator<ShiftAssignment>, Serializable{
	
	public int compare(ShiftAssignment a, ShiftAssignment b){
		Shift aShift = a.getShift();
		Shift bShift = b.getShift();
		return new CompareToBuilder()
		.append(bShift.getShiftDate(), aShift.getShiftDate())
		.append(bShift.getShiftType(), aShift.getShiftType())
		.append(aShift.getRequiredEmployeeSize(), bShift.getRequiredEmployeeSize())
		.toComparison();
	}

}
