package CernerInterviewQuestions;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Person Demographic Problem to store information about every person.

public class Person {

	String firstName;
	String lastName;
	Address address;
	Date dateOfBirth;
	String phoneNumber;

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + address + " " + dateOfBirth + " " + phoneNumber;
	}

	Person(String fn, String ln, Address address, Date dob, String phone) {
		firstName = fn;
		lastName = ln;
		this.address = address;
		dateOfBirth = dob;
		phoneNumber = phone;
	}
}
