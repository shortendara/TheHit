package com.thehit.domain;

import org.springframework.beans.factory.annotation.Required;

public class Venue {
	
	int capacity;
	Stage stage;
	
	
	public int getCapacity() {
		return capacity;
	}
	@Required
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
