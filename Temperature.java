package CernerInterviewQuestions;

/*
Temperature class to know whether patient has fever or not and in what location is the reading taken such as mouth, armpit, ear.
Default temperatures: 0.0º or 32.0F.
Convert Celsius to Fahrenheit.
Convert Fahrenheit to Celsius.
Update default temperature.*/

enum Location {
	Mouth, Armpit, Ear
};

public class Temperature {
	Location locations;
	char unit;
	double temp;

	Temperature() {
		temp = 0.0;
		unit = 'C';
	}

	void convertCtoF(){
		this.temp=this.temp*32;
	}
	void setTemperature(double temp) {
		this.temp = temp;

	}

	void setUnit(char unit) {
		// this.temp = temp;
		this.unit = unit;
	}

	double getTemperature() {
		return temp;
	}
	
	char getUnit(){
		return unit; 
	}

}
