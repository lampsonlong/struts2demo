package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;
 
public class HelloWorldAction extends ActionSupport {
 
    private static final long serialVersionUID = 1L;
 
    private MessageStore messageStore;
     
    public String execute() throws Exception {
         
        messageStore = new MessageStore() ;
        helloCount++;
        if(helloCount > 2){
        	//return ERROR;
        	throw new java.lang.Exception();
        }
        return SUCCESS;
    }
 
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
    
    private static int helloCount = 0;
    
    public int getHelloCount() {
        return helloCount;
    }
     
    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }
 
}