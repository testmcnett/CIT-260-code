//Purpose: this code demonstrates a possible security vulnerability with Java code

class Person {
	private String name;
	private Height height; //notice that we are using an object
	
	public Person(String p_name){
		name = p_name;
		height = new Height(5, 11); //we want this to be read-only
	}
	
	public Height getHeight(){ return height; }
	
	//notice that the setHeight method is missing
	
	public String toString(){
		return "Name " + name + "\nHeight " + height.getFeet() + " feet and " + height.getInches() + " inches";
	}
	
}

class Height {
	int feet;
	int inches;
	
	Height(int p_feet, int p_inches){
		feet = p_feet;
		inches = p_inches;
	}
	
	void setInches(int p_inches){
		inches = p_inches;
	}
	
	int getInches(){ 
		return inches;
	}
	
	int getFeet(){
		return feet;
	}
}

public class TestAccess {
	public static void main(String args[]){
		Person p1 = new Person("person1");
		Height p1_h = p1.getHeight();
		p1_h.setInches(6);
		System.out.println(p1);
	}
}


