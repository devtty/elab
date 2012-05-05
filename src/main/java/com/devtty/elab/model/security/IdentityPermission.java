package com.devtty.elab.model.security;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.jboss.seam.security.annotations.permission.PermissionProperty;
import org.jboss.seam.security.annotations.permission.PermissionPropertyType;

public class IdentityPermission implements Serializable{

	private Long id;
	private Identity identityObject;
	private IdentityRelationshipType relationshipType;
	private String relationshipName;
	private String ressource;
	private String permission;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotNull
	@ManyToOne
	@PermissionProperty(PermissionPropertyType.IDENTITY)
	public Identity getIdentity() {
		return identityObject;
	}
	public void setIdentity(Identity identityObject) {
		this.identityObject = identityObject;
	}
	
	@ManyToOne
	@PermissionProperty(PermissionPropertyType.RELATIONSHIP_TYPE)
	public IdentityRelationshipType getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(IdentityRelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}
	
    @PermissionProperty(PermissionPropertyType.RELATIONSHIP_NAME)
	public String getRelationshipName() {
		return relationshipName;
	}
	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}
	
    @PermissionProperty(PermissionPropertyType.RESOURCE)
	public String getRessource() {
		return ressource;
	}
	public void setRessource(String ressource) {
		this.ressource = ressource;
	}
	
    @PermissionProperty(PermissionPropertyType.PERMISSION)
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
	
	
}
