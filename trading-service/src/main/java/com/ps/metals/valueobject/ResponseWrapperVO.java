package com.ps.metals.valueobject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseWrapperVO {
	   private Boolean success;
	    private Boolean failure;
	    private Object data;
	    private String errorMessage;
	    
	  	    
	    @JsonCreator
	    public ResponseWrapperVO(@JsonProperty("success") Boolean success, @JsonProperty("data") Object data, @JsonProperty("failure") Boolean failure,@JsonProperty("errorMessage") String errorMessage){
	    	this.success = success;
	    	this.failure = failure;
	    	this.data = data;
	    	this.errorMessage = errorMessage;
	    } 


	    
	    public Boolean getSuccess() {
	        return success;
	    }

	    public Boolean getFailure() {
	        return failure;
	    }

	    public Object getData() {
	        return data;
	    }

	    public String getErrorMessage() {
	        return errorMessage;
	    }

}
