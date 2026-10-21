/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.ArrayList;

/**
 *
 * @author Student
 */


public class MessageStore {
    
     

        

    
    private ArrayList<Message>
            messages;
    
    public MessageStore(){
        messages = new ArrayList<>();
    }
    
    public void addMessage(Message message){
        messages.add(message);
    }
    
    public int getMessageCount(){
        return messages.size();
    }
    
    public Message getMessage(int index){
        return messages.get(index);
        
    }
}
        
             
        
        
              
        
        
        
        
    

    
        

    

