
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.Test;
 import static
 org.junit.jupiter.api.Assertions.*;

 
 
public class MessageStoreTests {
    
     @Test
    public void testAddMessage(){
        MessageStore store = new 
            MessageStore();
        
        Message message = new Message(
        "12345","Ntando","+27651762673","Hello"
        );
        
        store.addMessage(message);
        
        assertEquals(1,
        store.getMessageCount());
    }
    
    @Test
    public void testGetMessage(){
        MessageStore store = new
                MessageStore();
        Message message = new Message(
        "12345","Ntando","+27651762673","Hello"
        );
        
        store.addMessage(message);
        
        assertEquals("Hello",
                store.getMessage(0).getTextmessage());
    }
    
     @Test
    public void testMessageID(){
        Message message = new Message(
        "12345","Ntando","+27651762673","Hello"
        );
        
        
        assertTrue(message.checkMessageID());
        
    }
    
    @Test
    public void testMessageLength(){
        Message message = new Message(
        "12345",
        "Ntando",
        "+27651762673",
        "Hello"
        );
        
        
        assertTrue(message.checkMessageLength());
        
    }
    
    @Test
    public void testRecipientCell(){
        Message message = new Message(
        "12345",
        "Ntando",
        "+27651762673",
        "Hello"
        );
    

    
    
       
       
       
       assertEquals("Message discarded.",
               message.sendMessage(2));
   }
   
   @Test
   public void testStoreMessage(){
       Message message = new Message(
       "12345",
       "Ntando",
       "+27651762673",
       "Hello"
       );
       
       assertEquals("Message stored.",
               message.sendMessage(3));
   }
   
 @Test
   public void testInvalidMessageID(){
       Message message = new Message(
       "12345678901",
       "Ntando",
       "+27651762673",
       "Hello"
       );
       
       assertFalse(message.checkMessageID());
       
   }
   
   @Test
   public void testInvalidMessageLength()
   {
       String longText = "A".repeat(251);
       
       Message message = new Message(
       "123345",
       "Ntando",
       "+27651762673",
       longText
       );
       
       assertFalse(message.checkMessageLength());
       
   }
   
   @Test
   public void testInvalidRecipientCell()
   {
       Message message = new Message(
       "12345",
       "Ntando",
       "12345",
       "Hello"
       );
       
       assertFalse(message.checkRecipientCell());
      
   }
   
   @Test 
   public void testMessageHash(){
       Message message = new Message(
       "12345",
       "Ntando",
       "+27651762673",
       "Hello World"
       );
       
       assertEquals(
       "12:12345:HelloWorld",
               message.createMessageHash());
   }
   
}
   
   
