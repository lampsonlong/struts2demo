package org.apache.struts.register.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
    
    private Person personBean;
    private Map sports = new HashMap();
     
 
    public String register() throws Exception {

        //call Service class to store personBean's state in database
    	validate();
    	if (hasFieldErrors()){
    		return INPUT;
    	}
    	
        return SUCCESS;
         
    }
    
    public String create() throws Exception {

        //call Service class to store personBean's state in database
    	validate();
    	if (hasFieldErrors()){
    		return INPUT;
    	}
    	
        return SUCCESS;
         
    }
    
    public String edit() throws Exception {

        //call Service class to store personBean's state in database
    	validate();
    	if (hasFieldErrors()){
    		return INPUT;
    	}
    	
        return SUCCESS;
         
    }
    
    
    public Map getSports(){
//    	sports.putAll(personBean.getTest());
//    	sports.put("1","A");
//    	sports.put("2","B");
//    	sports.put("3","C");
    	Person a = new Person();
    	return a.getTest();
    }
    
    public void setSports(Map sports){
    	
    	this.sports = sports;
    }

     
    public Person getPersonBean() {
         
        return personBean;
         
    }
     
    public void setPersonBean(Person person) {
         
        personBean = person;
         
    }
    
    public void validate(){
        
        if ( personBean.getFirstName().length() == 0 ){ 
     
            addFieldError( "personBean.firstName", "First name is required." );
             
        }
         
                 
        if ( personBean.getEmail().length() == 0 ){ 
     
            addFieldError( "personBean.email", "Email is required." );
             
        }
         
        if ( personBean.getAge() < 18 ){ 
     
            addFieldError( "personBean.age", "Age is required and must be 18 or older" );
             
        }
        
        if ( personBean.getSport().length() == 0) {
        	addFieldError( "personBean.sport", "Sport is required." );
        }
    }
}
