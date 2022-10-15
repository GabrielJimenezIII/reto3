package com.computersusa.demo.repository;
import com.computersusa.demo.entities.Library;
import com.computersusa.demo.entities.Message;
import com.computersusa.demo.repository.crud.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    public List<Message> getAll(){return (List<Message>) messageCrudRepository.findAll();}
    public Optional<Message> getMessageId(int id){return messageCrudRepository.findById(id); }

    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
}
