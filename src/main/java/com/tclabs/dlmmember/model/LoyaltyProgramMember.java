package com.tclabs.dlmmember.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="LoyaltyProgramMembers")
public class LoyaltyProgramMember {
	@Id
	private String id;
	private String publicIdentifier;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublicIdentifier() {
		return publicIdentifier;
	}
	public void setPublicIdentifier(String publicIdentifier) {
		this.publicIdentifier = publicIdentifier;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
