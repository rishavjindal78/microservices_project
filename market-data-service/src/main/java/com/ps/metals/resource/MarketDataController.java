package com.ps.metals.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trades")
public class MarketDataController {

	@GetMapping("/data")
	public ResponseEntity<String> getMktTrades() {
		return new ResponseEntity<String>("Here is the real time prices for all trades",HttpStatus.OK);
	}
}
