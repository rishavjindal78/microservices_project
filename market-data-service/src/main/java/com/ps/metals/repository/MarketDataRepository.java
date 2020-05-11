package com.ps.metals.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ps.metals.domain.MarketData;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MarketDataRepository extends ReactiveMongoRepository<MarketData, String> {

	Flux<MarketData> findWithTailableCusorBy();
	
	//Mono<MarketData> findMarketDatabyCommodity(String commodity);
	
}
