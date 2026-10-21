/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
public class Main {
    
    public static void main(String[]
            args){
        
        Login user = new Login(
                "ab_c",
        "Passw0rd1!",
        "Ntandoyenkosi",
        "Dube",
        "+27651762673");
        
        // test 1: Valid username
        System.out.println("Username test:" + user.checkUserName());
        
        
        
        //test 2: Valid password
        System.out.println("Password test:" + user.checkPasswordStructure());
        
        //test 3: Registration
        System.out.println(user.registerUser());
        
        //test 4 : Valid CellPhoneNumber
        System.out.println("Cellphone number valid:"
                +  user.checkCellPhoneNumber());
        
        //test 5; correct login
        boolean correctLogin = 
                user.loginUser("ab_c", "Passw0rd1!");
        
        System.out.println("Correct login:" +  correctLogin);
        
        //test 6: Incorrect password
        boolean wrongLogin = 
                user.loginUser("nt_21", "wrongpassword");
        
        System.out.println("Wrong login:" +  wrongLogin);
        
        java.util.Scanner input = new 
            java.util.Scanner(System.in);
        int choice;
        MessageStore store = new
                MessageStore();
        int totalStoredMessages = 0;
        
        do{
            System.out.println("\n==== QUICKCHAT ====");
            System.out.println("1. Send Messages");
            System.out.println("2.Show recently sent messages");
            System.out.println("3. Quit");
            System.out.println("Choose an option:");
            
            choice = input.nextInt();
            
            switch (choice){
                
                case 1:
                    System.out.println("Enter message ID:");
                    String id = input.next();
                    System.out.println("Enter sender name:");
                    String sender = input.next();
                    System.out.println("Send Messages - Coming home");
                    
                    
                    
                    
                    
                    
                    
                    
                    System.out.println("Enter recipient number (+27...");
                    String receiver = input.next();
                    
                    input.nextLine(); // clear the input line
                    
                    System.out.println("Enter your message:");
                    String text = input.nextLine();
                    
                    Message message  = new Message(id,sender,receiver,text);
                    
                    if(message.checkMessageID()
                            && message.checkRecipientCell()
                            &&
                            message.checkMessageLength()){
                        store.addMessage(message);
                        
                        System.out.println(message.sendMessage(1));
                        System.out.println("Message hash:" + message.createMessageHash());
                    } else {
                        System.out.println("Invalid message ID, recipient number, or message lenght");
                    }
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
         
                              
                case 2:
                    System.out.println("Recently sent messages:");
                    for (int i = 0; i <
                            store.getMessageCount(); i++){
                        Message savedMessage =
                                store.getMessage(i);
                        System.out.println("Message ID:" +
                                savedMessage.getMessageID());
                                System.out.println("Message:" +
                                        savedMessage.getTextmessage());
                    }
                    
                if (Message.getTotalMessagesSent()
                        == 0){
                    System.out.println("No messages sent yet");
                } else {
                    System.out.println("Total messages sent:"
                            +
                            Message.getTotalMessagesSent());
                }
                    break;
                case 3:
                    System.out.println("Thank you for using QuickChat. Goodbye!");
                    break;
            }//closes switch
            
            } while (choice != 3);
    }   
        }
        


        
        
            
                    
                    
                    
            
        
        
        
        
        
        
        
        
        
                    
                            
            
                    
                    
                            
                            
                            
        
        
        
    
               
           
                
                
        
        
        
        
   
        
        
         
    

        
        
                
     
    
    

