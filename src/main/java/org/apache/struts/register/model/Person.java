package org.apache.struts.register.model;

import java.util.HashMap;
import java.util.Map;


public class Person
{
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String sport;
    private Map test = new HashMap();
 
    public String getFirstName()
    {
        return firstName;
    }
 
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
 
    public String getLastName()
    {
        return lastName;
    }
 
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
 
    public String getEmail()
    {
        return email;
    }
 
    public void setEmail(String email)
    {
        this.email = email;
    }
 
    public int getAge()
    {
        return age;
    }
 
    public void setAge( int age)
    {
        this.age = age;
    }
    
    public Map getTest(){
    	test.put("1","a");
    	test.put("2","b");
    	test.put("3","c");
    	return test;
    }
    
    public void setSport(String sport) {
    	this.sport = sport;
    }
    
    public String getSport() {
    	return sport;
    }
    
    public String toString()
    {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() + 
        " Email:      " + getEmail() + " Age:      " + getAge() ;
    }
}