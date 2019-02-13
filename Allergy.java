package CernerInterviewQuestions;

//Exercise 1:

//Develop an Allergy class which can hold different severities (HIGH, MEDIUM, LOW) and be tied to a Patient to retrieve the allergies associated with that patient and their respective severities.

enum Severity {
	High, Medium, Low
};

public class Allergy {

	Severity severity;
	String name;
	
	
	//@override
	public String toString(){
		return name + " " + severity;
	}
}
