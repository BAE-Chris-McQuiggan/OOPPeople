public class Person {

	// class variables
	private String name;
	private int age;
	private String jobTitle;

	// constructor
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	// overrides default toString to return desired thing
	@Override
	public String toString() {
		return ("Name: " + name + ", " + "Age: " + age + ", " + "Job Title: " + jobTitle);
	}

	// sets and gets for all class variables
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

}
