package com.thehit.domain;

public class Stage {

	private static Stage stage=null;
	
	public static Stage getInstance(){
		if(stage == null){
			stage = new Stage();
		}
		return stage;
	}
	/**
	* Method to be called to get the stage ready. This may involve turning on lights, opening the curtain etc.
	*/
	public void init(){
		System.out.println("Bean is in " + this.getClass().getName() + " init method");		
	}
		
	/**
	* Method to be called with everyone has finished performing on the stage.
	*/
	public void destroy(){
		System.out.println("Bean is in " + this.getClass().getName() + " destroy method");
	}
}
