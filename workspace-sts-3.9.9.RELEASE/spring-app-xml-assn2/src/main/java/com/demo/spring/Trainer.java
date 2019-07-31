package com.demo.spring;

import java.util.List;

public class Trainer {
	private String name;
	private List<Participants> participants;
	
	public Trainer() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Participants> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participants> participants) {
		this.participants = participants;
	}
	
	
}
