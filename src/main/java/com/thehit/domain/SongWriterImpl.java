package com.thehit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.thehit.interfaces.*;
@Component("customBeanName")
public class SongWriterImpl extends Person implements SongWriter{

	@Autowired
	private Song song;
	
	public SongWriterImpl(){
		super();
	}
	
	@Autowired
	public SongWriterImpl(@Value("Mary")String first_name, @Value("O Brien")String last_name, @Value("33") int age, Song song){
		super(first_name, last_name, age);
		this.song = song;
		//System.out.println("First name: " + first_name + " Second name: " + last_name + " Age: " + age
		//					+ " Song name: " + song.getName() + " Song Lyrics " + song.getLyrics());
	}
	@Override
	public void compose(Song song) {
		// TODO Auto-generated method stub
		System.out.println("Composer " + getFirst_name() + " "+ getLast_name() + " composed a song called " +song.getName() 
							+". This song has the following lyrics "+ song.getLyrics());    
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	
	
}
