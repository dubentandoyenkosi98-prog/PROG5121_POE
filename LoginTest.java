/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.*;
 

         
         
public class LoginTest {
    
    @Test
    public void testCheckUserName(){
        Login user = new Login(
        "ab_c", "Passw0rd1!","Ntando","Dube","+27651762673"
        );
        
        assertTrue(user.checkUserName());
    }
    
    @Test
    public void
    testCheckPasswordStructure(){
        Login user = new Login(
        "ab_c","Passw0rd1!",
        "Ntando","Dube","+27651762673"
        );
        
        assertTrue(user.checkPasswordStructure(
        ));
    }
    
    @Test
    public void testRegisterUser(){
        Login user = new Login(
        "ab_c","Passw0rd1!","Ntando","Dube","+27651762673"
        );
        
        assertEquals("User registered successfully.",user.registerUser());
        
        assertEquals("User registered successfully.", user.registerUser());
    }
    
    @Test
    public void testCorrectLogin(){
        Login user = new Login(
        "ab_c","Passw0rd1!","Ntando","Dube","+27651762673"
                );
        user.registerUser();
        
        assertTrue(user.loginUser("ab_c","Passw0rd1!"));
    }
    
    @Test
    public void testIncorrectLogin(){
        Login user = new Login(
        "ab_c","Passw0rd1!","Ntando","Dube","+27651762673"
        );
        user.registerUser();
        
        assertFalse(user.loginUser("wrong","wrong"));
    }
    
    @Test
    public void testReturnLoginStatus()
    {
        Login user = new Login(
        "ab_c","Passw0rd1!","Ntando","Dube","+27651762673"
        );
        assertEquals(
       "Welcome Ntando , Dube we are delighted to have you.",
                
                user.returnLoginStatus(true)
        );
        
    }
}
                                           
       
    
    
    
    
    
    
    
    
        
        
        
        
        
    
    

