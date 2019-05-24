import java.util.ArrayList;

public class PersonManager {

	// sets default class value of class object to a blank array list
	public ArrayList<Person> personList = new ArrayList<Person>();

	// method to search for name
	public Person serachForName(String name) {
		// filters objects checking obj.attribute against input
		return personList.stream().filter(p -> p.getName().equals(name)).findFirst().get();

	}

}
