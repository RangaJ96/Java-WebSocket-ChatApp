package com.spring.websocket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.websocket.model.ChatMessageDTO;

public interface ChatRepository extends JpaRepository<ChatMessageDTO, Integer> {
}
