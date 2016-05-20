package org.apache.struts.helloworld.model;

public class MessageStore {
	private String message;
	private String errMessage;
    
    public MessageStore() {
         
        setMessage("Hello Struts User");
    }
 
    public String getMessage() {
 
        return message;
    }
 
    public void setMessage(String message) {
 
        this.message = message;
    }
    
    public String getErrMessage() {
    	 
        return errMessage;
    }
 
    public void setErrMessage(String errMessage) {
 
        this.errMessage = errMessage;
    }

}
