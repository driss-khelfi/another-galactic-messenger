package com.example.galactic_messenger6.chat;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import javax.security.auth.kerberos.KerberosCredMessage;

@Controller
public class ChatController<SimpleMessageHeaderAccessor> {
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendmessage(@Payload ChatMessage chatMessage) {
        //TO-DO --to be implemented


        return chatMessage;
    }
    @MessageMapping("/chat.sendMessage")

    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpleMessageHeaderAccessor headerAccessor) {

        {

            headerAccessor.getClass().cast("username");
        }
        return chatMessage;
    }
}
