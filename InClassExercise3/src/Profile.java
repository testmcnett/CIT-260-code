//Class represents a student's academic profile
//Author: A McNett
//Date: 1/28/16

public class Profile {
	private int credits;
	private String major;
	private int year;

	public Profile(int credits, String major, int year) {
		this.credits = credits;
		this.major = major;
		this.year = year;
	}
	
	public boolean equals(Profile other){
		if(credits == other.credits && year == other.year && major.equals(other.major))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Profile [credits=" + credits + ", major=" + major + ", year=" + year + "]";
	}
}
