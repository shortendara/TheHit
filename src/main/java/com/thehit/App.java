package com.thehit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.thehit.interfaces.*;
import com.thehit.domain.*;
public class App {

	private static ApplicationContext context;	
	private static ApplicationContext autoWirecontext;
	public static void main (String args[]){
		//context=new ClassPathXmlApplicationContext("autoWireConfiguration.xml");
		autoWirecontext = new ClassPathXmlApplicationContext("autoWireConfiguration.xml");
		
		SongWriterImpl songWriterImpl=(SongWriterImpl)autoWirecontext.getBean("customBeanName");
		System.out.println(songWriterImpl.toString());
		
		System.out.println("Firstname:"+songWriterImpl.getFirst_name()+ ", Lastname: "+songWriterImpl.getLast_name()
        +", age:"+songWriterImpl.getAge()+", song name:"+songWriterImpl.getSong().getName()
        +", song lyrics:"+songWriterImpl.getSong().getLyrics());
		/** Simple bean blank constructor 
		SongWriter simpleBeanExample=(SongWriter)context.getBean("ourFirstBean");
		
		SongWriterImpl songwriter=(SongWriterImpl)context.getBean("mary");
		System.out.println("The songwriters firstname is: "+ songwriter.getFirst_name() + ": The songwriters lastname is: "+ songwriter.getLast_name() +
		        " The songwriters age is: " + songwriter.getAge() + " The songwriters song name is: " + songwriter.getSong().getName()+" The songwriters song lyrics are: "+
		        songwriter.getSong().getLyrics());
		
		Song setterDISong =(Song)context.getBean("setterBeanSong");
		System.out.println("Song name is: "+ setterDISong.getName());
		System.out.println("Song lyrics are: "+setterDISong.getLyrics());
		
		SongWriterImpl setterDISongwriter =(SongWriterImpl)context.getBean("setterSongwriter");
		System.out.println("Songwriter firstname is: "+ setterDISongwriter.getFirst_name());
		System.out.println("Songwriter second name is: "+setterDISongwriter.getLast_name());
		System.out.println("Songwriter age is: "+setterDISongwriter.getAge());
		System.out.println("Songwriter song details are: Song name: "+setterDISongwriter.getSong().getName()+
		        		" Song lyrics are: "+setterDISongwriter.getSong().getLyrics());
		**/
		/**
		 * Create Currency Bean using factory-method pattern
		 * Currency is created depending on country
		 
		Currency currency=(Currency)context.getBean("currency");
    	System.out.println("Currency symbol: " + currency.getSymbol());
    	*/
    	/**
    	 * Create Stage Bean using singleton pattern.
    	 
    	Stage stage=(Stage)context.getBean("theStage");
    	System.out.println("Stage instance value: "+ stage.toString());
    	*/
    	/**
    	 * Demonstrating collections in Spring.
    	 
    	CollectionsExample javaCollectionExample=(CollectionsExample)context.getBean("javaCollectionExample");
    	javaCollectionExample.getInstrumentList();
    	javaCollectionExample.getInstrumentSet();
    	javaCollectionExample.getInstrumentMap();
    	javaCollectionExample.getInstrumentProp();
    	*/
    	/**
    	 * Autowiring in Spring using byName
    	 
    	autoWirecontext=new ClassPathXmlApplicationContext
                ("autoWireConfiguration.xml");
                
    	SongWriterImpl songWriterAutoWire=(SongWriterImpl)autoWirecontext.getBean("autoWireExampleBean");
    	System.out.println("Song writer firstname is: "+ songWriterAutoWire.getFirst_name());
    	System.out.println("Song writer lastname is: "+ songWriterAutoWire.getLast_name());
    	System.out.println("Song writer age is: "+ songWriterAutoWire.getAge());
    	System.out.println("Song writer song name is: "+ songWriterAutoWire.getSong().getName()+ 
    			" lyrics: "+songWriterAutoWire.getSong().getLyrics());
    	*/
    	/**
    	 * Autowiring using byType exmaple
    	 * Can only be used if there is only one Bean of the type (i.e Song) declared in the configuration
    	 */
    	/**
    	SingerImpl singerAutoWireByType=(SingerImpl)autoWirecontext.getBean("autoWireExampleByTypeBean");
    	System.out.println("Singer firstname is: "+ singerAutoWireByType.getFirst_name());
    	System.out.println("Singer lastname is: "+ singerAutoWireByType.getLast_name());
    	System.out.println("Singer age is: "+ singerAutoWireByType.getAge());
    	System.out.println("Singer song name is: "+ singerAutoWireByType.getSong().getName()+ " lyrics: "+singerAutoWireByType.getSong().getLyrics());
    	
    	SongWriterImpl autoWirebyConstructor=(SongWriterImpl)autoWirecontext.getBean("autoWireExampleConstructorBean");
    	System.out.println("Song writer firstname is: "+ autoWirebyConstructor.getFirst_name());
    	System.out.println("Song writer lastname is: "+ autoWirebyConstructor.getLast_name());
    	System.out.println("Song writer age is: "+ autoWirebyConstructor.getAge());
    	System.out.println("Song writer song name is: "+ autoWirebyConstructor.getSong().getName()+ " lyrics: "+autoWirebyConstructor.getSong().getLyrics());
	
    	Venue annotationRequiredExample=(Venue)autoWirecontext.getBean("annotationRequiredExample");
    	System.out.println("Venue capacity is: " + annotationRequiredExample.getCapacity());
    	
    	Ticket ticket = (Ticket)autoWirecontext.getBean("new_ticket");
    	System.out.println("Ticket number is" + ticket.getTicketNumber() + "\nTicket price is: " + ticket.getTicket_price());
		*/
	}
}