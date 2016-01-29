//Class represents a student's info
//Author: A McNett
//Date: 1/28/16

public class Student {
	private String name;
	private String city;
	private Profile profile;

	public Student(String n, String city, int cr, String maj, int year) {
		name = n;
		this.city = city;
		this.profile = new Profile(cr, maj, year);
	}
	
	public Student(String n, String city, String maj, int year) {
		this(n, city, 0, maj, year);
	}
	
	public boolean equals(Student other){
		if(name.equals(other.name) && city.equals(other.city) && profile.equals(other.profile))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", profile=" + profile + "]";
	}
}
