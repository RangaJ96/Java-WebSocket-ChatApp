package com.spring.websocket.model;

import javax.persistence.*;

@Entity
@Table(name = "chatMessage")
public class ChatMessageDTO {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "chatId")
    private int chatId;
    @Column(name = "fromId")
    private String fromId;
    @Column(name = "toId")
    private String toId;
    @Column(name = "message")
    private String message;
    
    
    
	public String getFromId() {
		return fromId;
	}
	public void setFromId(String string) {
		this.fromId = string;
	}
	public String getToId() {
		return toId;
	}
	public void setToId(String name) {
		this.toId = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ChatMessageDTO(String fromId, String toId, String message) {
		super();
		this.fromId = fromId;
		this.toId = toId;
		this.message = message;
	}
	public ChatMessageDTO() {
		super();
	}
	
	


    
}
