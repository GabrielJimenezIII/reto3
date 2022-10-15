package com.computersusa.demo.services;


import com.computersusa.demo.entities.Message;
import com.computersusa.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServices {
    @Autowired
    private MessageRepository messageServices;

    public List<Message> getMessageAll(){
        return messageServices.getAll();
    }
    public Optional<Message> getMessageId(Integer id){
        return messageServices.getMessageId(id);
    }
    public Message save(Message message){
        if(message.getIdMessage()==null){
            return messageServices.save(message);
        } else{
            Optional<Message> message1= messageServices.getMessageId(message.getIdMessage());
            if (message1.isPresent()){
                return messageServices.save(message);
            }else{
                return message;
            }
        }
    }
}
