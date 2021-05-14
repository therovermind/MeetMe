package com.meetme.model;

import lombok.Getter;
import lombok.Setter;

public class ChatMessage {
	
	@Getter
	@Setter
	String sender;
	@Getter
	@Setter
	String content;
	@Getter
	@Setter
	MessageType messageType;
	
	public enum MessageType{
		CHAT,
		JOIN,
		LEAVE,
		STARTED,
		ENDED
	}
}
