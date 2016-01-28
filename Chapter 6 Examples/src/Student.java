class Student{  
	private int id;  
	private String name;  
	String school = "ICET";  

	 void change(){  
		school = "SHVC";  
	}  

	Student(int r, String n){  
		id = r;  
		name = n;  
	}  

	public void display(){
		System.out.println(id+" "+name+" "+school);
	}  

	public static void main(String args[]){  
		Student s1 = new Student(111,"Bob");  //ICET school student
		s1.change();
		Student s2 = new Student(222,"Ann");  //SHVC school student
		Student s3 = new Student(333,"Kelly");  //SHVC school student

		s1.display();  
		s2.display();  
		s3.display();  
	}  
}  