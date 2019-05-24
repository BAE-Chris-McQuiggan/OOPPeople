import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		// make people objects
		Person bob = new Person("Bob", 32, "Engineer");
		Person suzzi = new Person("Suzzi", 24, "Receptionist");
		Person jack = new Person("Jack", 19, "Student");
		Person bill = new Person("Bill", 56, "Postman");

		// sets manager list
		PersonManager pm1 = new PersonManager();
		pm1.personList.add(bob);
		pm1.personList.add(suzzi);
		pm1.personList.add(jack);
		pm1.personList.add(bill);

		// prints all in list
		pm1.personList.stream().collect(Collectors.toList()).forEach(System.out::println);

		// search for a name and returns details
		System.out.println(pm1.serachForName("Suzzi"));

	}

}
