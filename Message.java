/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
public class Message {
    private static int totalMessagesSent =
            0;
    
       
    private String messageID;
    private String  sender;
    private String receiver;
    private String Textmessage;
    
    public Message(String messageID, String sender,
            String receiver,String Textmessage){
        
        this.messageID = messageID;
        this.sender = sender;
        this.receiver = receiver;
        this.Textmessage = Textmessage;
    }
    
    public String getMessageID(){
        return messageID;
        
    }
    
    public String getSender(){
        return sender;
    }
    
    public String getReceiver(){
        return receiver;
    }
    
    public String getTextmessage(){
        return Textmessage;
    }
    
    
        
    
    public boolean checkMessageID() {
        return messageID != null &&
                messageID.length() <= 10;
    }
    
public boolean checkMessageLength(){
    return Textmessage != null &&
            Textmessage.length() <= 250;
}

public boolean checkRecipientCell() {
    return receiver != null
            && receiver.matches("^\\+\\d{10,15}$");
}

public String createMessageHash(){
    if (messageID == null ||
            Textmessage == null){
        return "";
    }
    
    String firstTwo = 
            messageID.length() >= 2
            ? messageID.substring(0, 2)
            : messageID;
    
    String[] words = 
            Textmessage.trim().split("\\s+");
    String firstWord = words.length > 
            0 ? words[0] : "";
    String lastWord = words.length > 0
            ? words[words.length - 1] :
    "";
    
    return firstTwo + ":" + messageID + 
            ":"
             
    + firstWord + lastWord;
}

public String sendMessage(int choice) {
    if (choice == 1){
        totalMessagesSent++;
        return "Message successfully sent.";
    } else if (choice == 2) {
        return "Message discarded.";
    } else if (choice == 3){
        return "Message stored.";
    } else {
        return "Invalid choice.";
    }
}

public static int
        getTotalMessagesSent(){
            return totalMessagesSent;
        }
        
}
            

    


    



