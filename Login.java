/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
public class Login {
    
      
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String cellPhoneNumber;
    
    public Login(String username, String password,
            String firstName, String lastName, String cellPhoneNumber){
        
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhoneNumber = cellPhoneNumber;
    }
    
    public boolean checkUserName(){
        return username != null
                && username.contains("_")
                && username.length() <= 5;
                
                
             
    }
    
    public boolean checkPasswordStructure(){
        if (password == null){
            return false;
        }
        
        return password.length() >=8
                &&
                password.matches(".*[a-z].*")
                &&
                password.matches(".*[0-9].*")
                &&
                password.matches(".*[^a-zA-Z0-9].*");
        }
    
    public String registerUser(){
        
        if (!checkUserName()){
            return "Username is not correctly presented.";
        }
        
        if(!checkPasswordStructure()){
            return "Password does not meet the standards.";
        }
        
        return "User registered successfully.";
    }
    
    public boolean loginUser(String displayedUsername,
            String displayedPassword){
        
        return username.equals(displayedUsername)
                &&
                password.equals(displayedPassword);
    }
    
    public String returnLoginStatus(boolean login){
        if(login){
            return "Welcome " + firstName +  " , " + lastName
                    + " we are delighted to have you.";
        } else {
            return "Username or password incorrect , start over.";
        }
        
    }
        
        
            
            
        
    
        
    
        
    public boolean checkCellPhoneNumber(){
        if (cellPhoneNumber == null){
            return false;
        }
        
        String phone = 
                cellPhoneNumber.trim();
        return phone.matches("\\+27[0-9]{9}");
        
        
               
    }          
    }

    
                
        
        
    
    


    


    

