package com.tclabs.dlmmember.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

import com.tclabs.dlmmember.dao.LoyaltyMemberDao;
import com.tclabs.dlmmember.model.LoyaltyBalance;
import com.tclabs.dlmmember.services.LoyaltyMemberServices;

@Service
public class LoyaltyMemberServicesImplementation implements LoyaltyMemberServices{
 @Autowired
 LoyaltyMemberDao loyaltyMemberDao;
 
	public Mono<LoyaltyBalance> create(LoyaltyBalance loyaltyBalance) {
		return loyaltyMemberDao.save(loyaltyBalance);
	
	}

}
