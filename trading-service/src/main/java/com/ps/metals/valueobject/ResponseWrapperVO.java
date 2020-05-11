package com.ps.metals.valueobject;

public class ResponseWrapperVO {
	   private Boolean success;
	    private Boolean failure;
	    private Object data;
	    private String errorMessage;
	    
	    public ResponseWrapperVO() {
	    	
	    }
	    

	    public ResponseWrapperVO(Boolean success, Object data) {
	        this.success = success;
	        this.data = data;
	    }

	    public ResponseWrapperVO(Boolean failure, String errorMessage) {
	        this.failure = failure;
	        this.errorMessage = errorMessage;
	    }


	    public static ResponseWrapperVO success(Object data) {
	        return new ResponseWrapperVO(true, data);
	    }

	    public static ResponseWrapperVO failure(String message) {
	        return new ResponseWrapperVO(true, message);
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
