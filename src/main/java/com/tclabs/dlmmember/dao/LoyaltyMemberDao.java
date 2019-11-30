package com.tclabs.dlmmember.dao;


import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

import com.tclabs.dlmmember.model.*;

@Repository
public interface LoyaltyMemberDao extends ReactiveMongoRepository<LoyaltyBalance,Object>{

	public Mono<LoyaltyBalance> save(LoyaltyBalance loyaltyBalance);

}
