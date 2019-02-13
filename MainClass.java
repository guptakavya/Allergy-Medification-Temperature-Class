package CernerInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Exercise 3:
//Given a list of streamed patients (consisting of names, briths, date last seen), return the 3 most recently seen patients from that list. Assume the list of incoming patients is not ordered in any particular order.

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		Collections.sort(patientList, new SortByLastSeen());
		for (int i = 0; i < 4; i++) {
			System.out.println(patientList.get(i));
		}
	}

}
