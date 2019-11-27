package com.spring.websocket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.websocket.model.ChatMessageDTO;
import com.spring.websocket.repository.ChatRepository;
import com.spring.websocket.service.ChatService;

import java.util.List;
import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Override
    public List<ChatMessageDTO> findAllMessages() {
        return chatRepository.findAll();
    }

    @Override
    public void saveMessage(ChatMessageDTO ChatMessageDTO) {
        chatRepository.save(ChatMessageDTO);
    }

    @Override
    public Optional<ChatMessageDTO> findById(Integer id) {
        return chatRepository.findById(id);
    }
}
