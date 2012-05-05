package com.devtty.elab.model.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;
import org.jboss.seam.security.annotations.management.IdentityProperty;
import org.jboss.seam.security.annotations.management.PropertyType;

@Entity
@IdentityEntity(EntityType.IDENTITY_ATTRIBUTE)
public class IdentityAttribute {

	private Integer attributeId;
	private Identity identity;
	private String name;
	private String value;
	
	@Id
	@GeneratedValue
	public Integer getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}
	
	@ManyToOne
	@JoinColumn(name = "IDENTITY_OBJECT_ID")
	public Identity getIdentity() {
		return identity;
	}
	public void setIdentity(Identity identity) {
		this.identity = identity;
	}
	
	@IdentityProperty(PropertyType.NAME)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@IdentityProperty(PropertyType.VALUE)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
