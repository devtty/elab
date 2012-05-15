package com.devtty.elab.model.planner;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.devtty.elab.model.common.AbstractPersistable;
import com.devtty.elab.model.planner.contract.Contract;

@Entity
public class Employee extends AbstractPersistable{
	
	private String code;
	private String name;
	private Contract contract;
	private List<SkillProficiency> skillProficiencies;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	@OneToMany(mappedBy="employee")	
	public List<SkillProficiency> getSkillProficiencies() {
		return skillProficiencies;
	}

	public void setSkillProficiencies(List<SkillProficiency> skillProficiencies) {
		this.skillProficiencies = skillProficiencies;
	}

	@Transient
	public int getWeekendLength(){
		return getContract().getWeekendLength();
	}

}
