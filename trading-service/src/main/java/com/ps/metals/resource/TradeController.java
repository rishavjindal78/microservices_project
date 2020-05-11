package com.ps.metals.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.metals.openfeign.RefDataServiceFeignClient;
import com.ps.metals.valueobject.ResponseWrapperVO;

@RestController
@RequestMapping("/trades")
public class TradeController {
	
	private static final Logger log = LoggerFactory.getLogger(TradeController.class);
	
	@Autowired
	private RefDataServiceFeignClient feignClient;
	
	
	@RequestMapping("/status")
	public ResponseEntity<String> trades() {
		log.info("entered into trades::::");
		return new ResponseEntity<>("trading is started", HttpStatus.OK);
	}
	
	@GetMapping("/aggregate")
	public ResponseEntity<ResponseWrapperVO> aggregate() {
		log.info("entered into aggregate::::");
		return feignClient.getRefData("location");
	}

}
