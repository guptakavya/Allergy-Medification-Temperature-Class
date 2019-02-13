package CernerInterviewQuestions;

import java.time.ZonedDateTime;

//Design a class where a nurse had to assign medication to a patient along with the start and the end dates (there may or may not be end date).
public class Medication {
	ZonedDateTime startDateTime; 
	ZonedDateTime endDateTime; 
	String name; 
	
	
	Medication(String name, ZonedDateTime startDateTime){
		this.name = name; 
		this.startDateTime = startDateTime;
	}
	

	Medication(String name, ZonedDateTime startDateTime,  ZonedDateTime endDateTime){
		this.name = name; 
		this.startDateTime = startDateTime;
		this.endDateTime = startDateTime;
	}
	}
