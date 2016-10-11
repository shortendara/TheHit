package com.thehit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Song {

	private String name;
	private String lyrics;
	
	@Autowired
	public Song(@Value("Ohh Danny boy") String name,@Value("The pipes the pipes are calling") String lyrics){
		this.name=name;
		this.lyrics=lyrics;
	}
	
	public Song(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
}
