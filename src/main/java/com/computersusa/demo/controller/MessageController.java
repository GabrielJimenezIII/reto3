package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Message;
import com.computersusa.demo.services.MessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Message")

public class MessageController {
    @Autowired
    private MessageServices messageServices;
    @GetMapping("/all")
    public List<Message> getMessageAll(){
        return messageServices.getMessageAll();
    }
    @GetMapping("/{id}")
    public Optional<Message> getMessageId(@PathVariable("id")Integer id){
        return messageServices.getMessageId(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save (@RequestBody Message message){
        return messageServices.save(message);
    }

}
