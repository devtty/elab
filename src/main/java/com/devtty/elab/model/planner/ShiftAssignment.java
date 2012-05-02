package com.devtty.elab.model.planner;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.contract.Contract;

//@PlanningEntity(difficultyComparatorClass = ShiftAssignmentDifficultyComparator.class)
public class ShiftAssignment extends AbstractPersistable{

	private Shift shift;
	private int indexInShift;
	
	private Employee employee;

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public int getIndexInShift() {
		return indexInShift;
	}

	public void setIndexInShift(int indexInShift) {
		this.indexInShift = indexInShift;
	}

	//@PlanningVariable(strengthComparatorClass = EmployeeStrengthComparator.class)
	//@ValueRange(type = ValueRangeType.FROM_SOLUTION_PROPERTY, solutionProperty = "employeeList")
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	//Complex methods
	
	public ShiftDate getShiftDate(){
		return shift.getShiftDate();
	}
	
	public ShiftType getShiftType(){
		return shift.getShiftType();
	}
	
	public int getShiftDateDayIndex(){
		return shift.getShiftDate().getDayIndex();
	}
	
	public Contract getContract(){
		if(employee == null){
			return null;
		}
		return employee.getContract();
	}
	
	public boolean isWeekend(){
		if(employee == null){
			return false;
		}
		WeekendDefinition weekendDefinition = employee.getContract().getWeekendDefinition();
		DayOfWeek dayOfWeek = shift.getShiftDate().getDayOfWeek();
		return weekendDefinition.isWeekend(dayOfWeek);
	}
	
	public int getWeekendSundayIndex(){
		return shift.getShiftDate().getWeekendSundayIndex();
	}
	
	public ShiftAssignment clone(){
		ShiftAssignment clone = new ShiftAssignment();
		clone.id = id;
		clone.shift = shift;
		clone.indexInShift = indexInShift;
		clone.employee = employee;
		return clone;
	}
	
	/**
	* The normal methods {@link #equals(Object)} and {@link #hashCode()} cannot be used because the rule engine already
	* requires them (for performance in their original state).
	* @see #solutionHashCode()
	*/
	public boolean solutionEquals(Object o) {
		if (this == o) {
			return true;
	    } else if (o instanceof ShiftAssignment) {
	        ShiftAssignment other = (ShiftAssignment) o;
	        return new EqualsBuilder()
	                    .append(id, other.id)
	                    .append(shift, other.shift)
	                    .append(employee, other.employee)
	                    .isEquals();
	    } else {
	        return false;
	    }
	}

	/**
	* The normal methods {@link #equals(Object)} and {@link #hashCode()} cannot be used because the rule engine already
	* requires them (for performance in their original state).
	* @see #solutionEquals(Object)
	*/
	public int solutionHashCode() {
	    return new HashCodeBuilder()
	         .append(id)
	         .append(shift)
	         .append(employee)
	         .toHashCode();
	}

	@Override
	public String toString() {
	    return shift + "->" + employee;
	}
	
}
