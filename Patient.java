package CernerInterviewQuestions;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

//Design a system for entering and displaying the allergies patients have with given fields.
//@Override
class SortByLastSeen implements Comparator<Patient> {
	// @Override
	public int compare(Patient a, Patient b) {
		return a.lastSeen.compareTo(b.lastSeen);
	}
}

public class Patient extends Person {

	int id;
	ZonedDateTime lastSeen;
	List<Allergy> allergies;
	List<Medication> medicines;
	List<Temperature> temperatureHistory;

	Patient(String fn, String ln, Address address, Date dob, String phone, List<Allergy> allergies) {
		super(fn, ln, address, dob, phone);
		this.allergies = new ArrayList<>();
		this.allergies.addAll(allergies);
		this.lastSeen = ZonedDateTime.now();
		this.medicines = new ArrayList<>();
		this.temperatureHistory = new ArrayList();
	}

	Temperature getTemp() {
		return temperatureHistory.get(temperatureHistory.size() - 1);
	}

	boolean hasFever() {
		double temperatureSum = 0.0;
		for (Temperature temp : temperatureHistory) {
			if (temp.getUnit() == 'C') {
				temp.convertCtoF();
			}
			temperatureSum += temp.getTemperature();
		}

		double average = temperatureSum / temperatureHistory.size();

		if (this.getTemp().getTemperature() > average)
			return true;
		else
			return false;
	}

	// alternative but avoid and use like we did in address object
	void addTemperature(Temperature temp) {
		temperatureHistory.add(temp);
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getFirstName() {
		return firstName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String getLastName() {
		return lastName;
	}

	void setAddress(Address address) {
		this.address = address;
	}

	Address getAddress() {
		return address;
	}

	void setAllergies(List<Allergy> allergy) {
		this.allergies.addAll(allergy);
	}

	List<Allergy> getAllergies() {
		return allergies;
	}

	void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	Date getDateOfBirth() {
		return dateOfBirth;
	}

	void setLastSeen(ZonedDateTime lastSeen) {
		this.lastSeen = lastSeen;
	}

	ZonedDateTime getLastSeen() {
		return lastSeen;
	}

	void setPhoneNumber(String phone) {
		this.phoneNumber = phone;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}
}
