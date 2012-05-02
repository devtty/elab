package com.devtty.elab.model.planner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.drools.planner.core.score.HardAndSoftScore;
import org.drools.planner.core.solution.Solution;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.contract.Contract;
import com.devtty.elab.model.planner.contract.ContractLine;
import com.devtty.elab.model.planner.contract.PatternContractLine;
import com.devtty.elab.model.planner.request.DayOffRequest;
import com.devtty.elab.model.planner.request.DayOnRequest;
import com.devtty.elab.model.planner.request.ShiftOffRequest;
import com.devtty.elab.model.planner.request.ShiftOnRequest;

public class NurseRoster extends AbstractPersistable implements Solution<HardAndSoftScore>{
	
	private String code;
	
	private List<Skill> skillList;
	private List<ShiftType> shiftTypeList;
	private List<ShiftTypeSkillRequirement> shiftTypeSkillRequirementList;
	private List<Pattern> patternList;
	private List<Contract> contractList;
	private List<ContractLine> contractLineList;
	private List<PatternContractLine> patternContractLineList;
	private List<Employee> employeeList;
	private List<SkillProficiency> skillProficiencyList;
	private List<ShiftDate> shiftDateList;
	private List<Shift> shiftList;
	private List<DayOffRequest> dayOffRequestList;
	private List<DayOnRequest> dayOnRequestList;
	private List<ShiftOffRequest> shiftOffRequestList;
	private List<ShiftOnRequest> shiftOnRequestList;
	
	private List<ShiftAssignment> shiftAssignmentList;
	
	private HardAndSoftScore score;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public List<ShiftType> getShiftTypeList() {
		return shiftTypeList;
	}

	public void setShiftTypeList(List<ShiftType> shiftTypeList) {
		this.shiftTypeList = shiftTypeList;
	}

	public List<ShiftTypeSkillRequirement> getShiftTypeSkillRequirementList() {
		return shiftTypeSkillRequirementList;
	}

	public void setShiftTypeSkillRequirementList(
			List<ShiftTypeSkillRequirement> shiftTypeSkillRequirementList) {
		this.shiftTypeSkillRequirementList = shiftTypeSkillRequirementList;
	}

	public List<Pattern> getPatternList() {
		return patternList;
	}

	public void setPatternList(List<Pattern> patternList) {
		this.patternList = patternList;
	}

	public List<Contract> getContractList() {
		return contractList;
	}

	public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}

	public List<ContractLine> getContractLineList() {
		return contractLineList;
	}

	public void setContractLineList(List<ContractLine> contractLineList) {
		this.contractLineList = contractLineList;
	}

	public List<PatternContractLine> getPatternContractLineList() {
		return patternContractLineList;
	}

	public void setPatternContractLineList(
			List<PatternContractLine> patternContractLineList) {
		this.patternContractLineList = patternContractLineList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<SkillProficiency> getSkillProficiencyList() {
		return skillProficiencyList;
	}

	public void setSkillProficiencyList(List<SkillProficiency> skillProficiencyList) {
		this.skillProficiencyList = skillProficiencyList;
	}

	public List<ShiftDate> getShiftDateList() {
		return shiftDateList;
	}

	public void setShiftDateList(List<ShiftDate> shiftDateList) {
		this.shiftDateList = shiftDateList;
	}

	public List<Shift> getShiftList() {
		return shiftList;
	}

	public void setShiftList(List<Shift> shiftList) {
		this.shiftList = shiftList;
	}

	public List<DayOffRequest> getDayOffRequestList() {
		return dayOffRequestList;
	}

	public void setDayOffRequestList(List<DayOffRequest> dayOffRequestList) {
		this.dayOffRequestList = dayOffRequestList;
	}

	public List<DayOnRequest> getDayOnRequestList() {
		return dayOnRequestList;
	}

	public void setDayOnRequestList(List<DayOnRequest> dayOnRequestList) {
		this.dayOnRequestList = dayOnRequestList;
	}

	public List<ShiftOffRequest> getShiftOffRequestList() {
		return shiftOffRequestList;
	}

	public void setShiftOffRequestList(List<ShiftOffRequest> shiftOffRequestList) {
		this.shiftOffRequestList = shiftOffRequestList;
	}

	public List<ShiftOnRequest> getShiftOnRequestList() {
		return shiftOnRequestList;
	}

	public void setShiftOnRequestList(List<ShiftOnRequest> shiftOnRequestList) {
		this.shiftOnRequestList = shiftOnRequestList;
	}

	public List<ShiftAssignment> getShiftAssignmentList() {
		return shiftAssignmentList;
	}

	public void setShiftAssignmentList(List<ShiftAssignment> shiftAssignmentList) {
		this.shiftAssignmentList = shiftAssignmentList;
	}

	public HardAndSoftScore getScore() {
		return score;
	}

	public void setScore(HardAndSoftScore score) {
		this.score = score;
	}
	
	public Collection<? extends Object> getProblemFacts(){
		List<Object> facts = new ArrayList<Object>();
		// TODO add RosterInfo as a property on NurseRoster
        facts.add(new RosterInfo(shiftDateList.get(0), shiftDateList.get(shiftDateList.size() - 1)));
        facts.addAll(skillList);
        facts.addAll(shiftTypeList);
        facts.addAll(shiftTypeSkillRequirementList);
        facts.addAll(patternList);
        facts.addAll(contractList);
        facts.addAll(contractLineList);
        facts.addAll(patternContractLineList);
        facts.addAll(employeeList);
        facts.addAll(skillProficiencyList);
        facts.addAll(shiftDateList);
        facts.addAll(shiftList);
        facts.addAll(dayOffRequestList);
        facts.addAll(dayOnRequestList);
        facts.addAll(shiftOffRequestList);
        facts.addAll(shiftOnRequestList);
        // Do not add the planning entity's (shiftAssignmentList) because that will be done automatically
        return facts;
	}

	/**
	* Clone will only deep copy the {@link #shiftAssignmentList}.
	*/
	    public NurseRoster cloneSolution() {
	        NurseRoster clone = new NurseRoster();
	        clone.id = id;
	        clone.code = code;
	        clone.skillList = skillList;
	        clone.shiftTypeList = shiftTypeList;
	        clone.shiftTypeSkillRequirementList = shiftTypeSkillRequirementList;
	        clone.patternList = patternList;
	        clone.contractList = contractList;
	        clone.contractLineList = contractLineList;
	        clone.patternContractLineList = patternContractLineList;
	        clone.employeeList = employeeList;
	        clone.skillProficiencyList = skillProficiencyList;
	        clone.shiftDateList = shiftDateList;
	        clone.shiftList = shiftList;
	        clone.dayOffRequestList = dayOffRequestList;
	        clone.dayOnRequestList = dayOnRequestList;
	        clone.shiftOffRequestList = shiftOffRequestList;
	        clone.shiftOnRequestList = shiftOnRequestList;
	        List<ShiftAssignment> clonedShiftAssignmentList = new ArrayList<ShiftAssignment>(
	                shiftAssignmentList.size());
	        for (ShiftAssignment shiftAssignment : shiftAssignmentList) {
	            ShiftAssignment clonedShiftAssignment = shiftAssignment.clone();
	            clonedShiftAssignmentList.add(clonedShiftAssignment);
	        }
	        clone.shiftAssignmentList = clonedShiftAssignmentList;
	        clone.score = score;
	        return clone;
	    }

	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (id == null || !(o instanceof NurseRoster)) {
	            return false;
	        } else {
	            NurseRoster other = (NurseRoster) o;
	            if (shiftAssignmentList.size() != other.shiftAssignmentList.size()) {
	                return false;
	            }
	            for (Iterator<ShiftAssignment> it = shiftAssignmentList.iterator(), otherIt = other.shiftAssignmentList.iterator(); it.hasNext();) {
	                ShiftAssignment shiftAssignment = it.next();
	                ShiftAssignment otherShiftAssignment = otherIt.next();
	                // Notice: we don't use equals()
	                if (!shiftAssignment.solutionEquals(otherShiftAssignment)) {
	                    return false;
	                }
	            }
	            return true;
	        }
	    }

	    public int hashCode() {
	        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
	        for (ShiftAssignment shiftAssignment : shiftAssignmentList) {
	            // Notice: we don't use hashCode()
	            hashCodeBuilder.append(shiftAssignment.solutionHashCode());
	        }
	        return hashCodeBuilder.toHashCode();
	    }


}
