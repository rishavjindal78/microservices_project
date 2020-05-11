package com.ps.metals.resource;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ps.metals.domain.MarketData;
import com.ps.metals.repository.MarketDataRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class MarketDataController {

	private final MarketDataRepository repository;

	public MarketDataController(MarketDataRepository repository) {
		this.repository = repository;
	}

	@GetMapping(value = "/trades", produces= MediaType.TEXT_EVENT_STREAM_VALUE)
	@ResponseBody
	public Flux<MarketData> findRealTimeMktData() {
				return repository.findWithTailableCusorBy().delayElements(Duration.ofMillis(2000));
	}

	/*
	 * @GetMapping(value = "/data/{name}") Mono<MarketData> findById(@PathVariable
	 * String name){ return repository.findMarketDatabyCommodity(name); }
	 */

	@GetMapping("/")
	Mono<String> home() {
		return Mono.just("trades");
	}


}
