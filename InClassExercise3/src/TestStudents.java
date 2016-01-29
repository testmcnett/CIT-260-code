//This class tests the Student and Profile classes
//Author: A McNett
//Date: 1/28/16

public class TestStudents {

	public static void main(String[] args) {
		
		//beware of start quotes when copying and pasting from Word or Plato!
		Student studentOne = new Student("Bob", "Williamsport", 60, "BSI", 2014);
		Student studentTwo = new Student("Ann", "Milton", 30, "BGS", 2015);
		Student studentThree = new Student("Bob", "Williamsport", 60, "BSI", 2014);
		Student studentFour = new Student("Melissa", "Philadelphia", "BSI", 2016);

			
		System.out.println(studentOne);
		System.out.println(studentTwo);
		System.out.println(studentThree);
		
		if (studentOne.equals(studentTwo))
				System.out.println("they match!"); 
		else
			System.out.println("they do not match!");
	}

}
