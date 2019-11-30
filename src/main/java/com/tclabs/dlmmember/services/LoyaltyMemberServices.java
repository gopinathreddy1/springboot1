package com.tclabs.dlmmember.services;

import reactor.core.publisher.Mono;

import com.tclabs.dlmmember.model.*;

public interface LoyaltyMemberServices {
		public Mono<LoyaltyBalance> create(LoyaltyBalance loyaltyBalance);
}
