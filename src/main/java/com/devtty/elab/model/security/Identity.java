package com.devtty.elab.model.security;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;
import org.jboss.seam.security.annotations.management.IdentityProperty;
import org.jboss.seam.security.annotations.management.PropertyType;

@Entity
@IdentityEntity(EntityType.IDENTITY_OBJECT)
public class Identity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private IdentityType identityType;
	private String credential;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}
	
	@NotNull
	@Size(min=1, max=32)
	@Column(unique=true, nullable=false)
	@IdentityProperty(PropertyType.NAME)
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}	
	
	@ManyToOne
	@IdentityProperty(PropertyType.TYPE)
	public IdentityType getIdentityType(){
		return identityType;
	}
	
	public void setIdentityType(IdentityType identityType){
		this.identityType = identityType;
	}

	@IdentityProperty(PropertyType.CREDENTIAL)
	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

}