package com.spring.websocket.service;

import java.util.List;
import java.util.Optional;

import com.spring.websocket.model.ChatMessageDTO;


public interface ChatService{

    List<ChatMessageDTO> findAllMessages();

    void saveMessage(ChatMessageDTO ChatMessageDTO);

    Optional<ChatMessageDTO> findById(Integer id);

}
