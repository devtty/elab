package com.devtty.elab.model.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.jboss.seam.security.annotations.management.IdentityProperty;
import org.jboss.seam.security.annotations.management.PropertyType;

@Entity
public class IdentityRelationship implements Serializable{

	private Long id;
	private String name;
	private IdentityRelationshipType relationshipType;
	private Identity from;
	private Identity to;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
    @IdentityProperty(PropertyType.NAME)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
    @IdentityProperty(PropertyType.TYPE)
    @JoinColumn(name = "RELATIONSHIP_TYPE_ID")
	public IdentityRelationshipType getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(IdentityRelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}
	
	@ManyToOne
    @IdentityProperty(PropertyType.RELATIONSHIP_FROM)
    @JoinColumn(name = "FROM_IDENTITY_ID")
	public Identity getFrom() {
		return from;
	}
	public void setFrom(Identity from) {
		this.from = from;
	}
	
	@ManyToOne
    @IdentityProperty(PropertyType.RELATIONSHIP_TO)
    @JoinColumn(name = "TO_IDENTITY_ID")
	public Identity getTo() {
		return to;
	}
	public void setTo(Identity to) {
		this.to = to;
	}
	
	
}
