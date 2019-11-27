package com.spring.websocket.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.websocket.model.ChatMessageDTO;
import com.spring.websocket.service.ChatService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/message")
public class ChatController {

    @Autowired
   private ChatService chatService;

    @GetMapping("/all")
    public List<ChatMessageDTO> findAllMessages(){
        return chatService.findAllMessages();
    }

    @PostMapping("/save")
    public String saveMessage(@RequestBody ChatMessageDTO ChatMessageDTO){
        chatService.saveMessage(ChatMessageDTO);
        return "Data saved";
    }


    @GetMapping("/find/{id}")
    public Optional<ChatMessageDTO> findById(@PathVariable Integer id){
        return chatService.findById(id);
    }

}
