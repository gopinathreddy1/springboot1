package com.tclabs.dlmmember.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import com.tclabs.dlmmember.exceptions.NullDataException;
import com.tclabs.dlmmember.model.LoyaltyBalance;
import com.tclabs.dlmmember.services.LoyaltyMemberServices;
@RestController
@RequestMapping("/member")
public class LoyaltyProgramMemberContoller {
	@Autowired LoyaltyMemberServices loyaltyMemberServices;
	
	@PostMapping("/create")
		public Mono<LoyaltyBalance> create(@RequestBody LoyaltyBalance loyaltyBalance) throws NullDataException{
	Mono<LoyaltyBalance> loyaltyBalances= loyaltyMemberServices.create(loyaltyBalance);
	if(loyaltyBalances!=null){
		return loyaltyBalances;
	}
	else{
		throw new NullDataException("you have sent an empty json object") ;	
	}
	}
}
