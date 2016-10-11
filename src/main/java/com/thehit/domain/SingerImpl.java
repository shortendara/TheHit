package com.thehit.domain;
import com.thehit.interfaces.*;
public class SingerImpl extends Person implements Singer{

	private Song song;
	
	public SingerImpl(String first_name, String last_name, int age, Song song){
		super(first_name, last_name,age);
		this.song=song;		
	}
	
	public SingerImpl(){
		super();
	}
	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	@Override
	public void perform(Song song) {
		// TODO Auto-generated method stub
		
	}

}
