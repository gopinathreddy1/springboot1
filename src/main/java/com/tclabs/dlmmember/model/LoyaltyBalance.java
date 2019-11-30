package com.tclabs.dlmmember.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="LoyaltyBalance")
public class LoyaltyBalance {
	 public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LoyaltyProgramMember getLoyaltyProgramMember() {
		return loyaltyProgramMember;
	}
	public void setLoyaltyProgramMember(LoyaltyProgramMember loyaltyProgramMember) {
		this.loyaltyProgramMember = loyaltyProgramMember;
	}
	public Quantity getQuantity() {
		return quantity;
	}
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	private String id;
	 private String name;
	 private LoyaltyProgramMember loyaltyProgramMember;
     private Quantity quantity;
}
