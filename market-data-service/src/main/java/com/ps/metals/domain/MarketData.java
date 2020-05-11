package com.ps.metals.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "metals")
public class MarketData {
	
	private String commodity;
	private String price;
	private String currency;
	
	
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
