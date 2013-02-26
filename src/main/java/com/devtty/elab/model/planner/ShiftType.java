package com.devtty.elab.model.planner;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.devtty.elab.model.common.AbstractPersistable;

@Entity
public class ShiftType extends AbstractPersistable{

	private String code;
	private int idx;
	private String startTimeString;
	private String endTimeString;
	private boolean night;
	private String description;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getStartTimeString() {
		return startTimeString;
	}
	public void setStartTimeString(String startTimeString) {
		this.startTimeString = startTimeString;
	}
	public String getEndTimeString() {
		return endTimeString;
	}
	public void setEndTimeString(String endTimeString) {
		this.endTimeString = endTimeString;
	}
	
	@org.hibernate.annotations.Type(type="true_false")
	@NotNull
	public boolean isNight() {
		return night;
	}
	public void setNight(boolean night) {
		this.night = night;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString(){
		return code;
	}
}
