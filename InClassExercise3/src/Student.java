//Class represents a student's info
//Author: A McNett
//Date: 1/28/16

public class Student {
	private String name;
	private String city;
	private Profile profile;
	
	public Student(String name, String city, Profile profile) {
		this.name = name;
		this.city = city;
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", profile=" + profile + "]";
	}
}
