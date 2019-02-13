package CernerInterviewQuestions;

//Address class to store all patients address
public class Address {

	String line1;
	String line2;
	String city;
	String zipCode;
	String country;

	Address(String line1, String line2, String city, String zipCode, String country) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	// Setters and Getters for each variable - to edit form

	void setLine1(String line1) {
		this.line1 = line1;
	}

	String getLine1() {
		return line1;
	}

	void setLine2(String line2) {
		this.line2 = line2;
	}

	String getLine2() {
		return line2;
	}

	void setCity(String city) {
		this.city = city;
	}

	String getCity() {
		return city;
	}

	void setZipCode(String zipCode) {
		this.zipCode = line1;
	}

	String getZipCode() {
		return zipCode;
	}

	void setCountry(String country) {
		this.country = country;
	}

	String getCountry() {
		return country;
	}

}
