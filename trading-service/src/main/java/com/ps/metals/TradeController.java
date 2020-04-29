package com.ps.metals;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trades")
public class TradeController {
	
	@RequestMapping("/status")
	public ResponseEntity<String> trades() {
		return new ResponseEntity<>("trading is started", HttpStatus.OK);
	}

}
