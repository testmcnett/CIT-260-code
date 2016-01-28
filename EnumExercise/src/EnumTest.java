//Class demonstrates the use of enums
//Date: 1/21/16
//Author: A. McNett

enum Direction { 
	NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
	private char abbr;  //can have any many attributes as we want
	
	private Direction(char letter){ //constructor must be declared private
		abbr = letter;
	}
	
	@Override
	public String toString(){ //let's write our own toString
		return "abbr: " + abbr + " value: " + name();
	}
}; //yep, optional semi-colon

public class EnumTest{
	
	 public static void main(String[] args) { // type m, ctrl + space to generate this method quickly
		 Direction myDirection = Direction.NORTH;
		 Direction yourDirection = Direction.SOUTH;
		 yourDirection = Direction.EAST;
		 System.out.println(myDirection + " " + myDirection.ordinal()); //calls our toString implicitly
		 
		 if(myDirection.compareTo(yourDirection) < 0) //compares ordinal values
			 System.out.println("My direction is less than your direction.");
	}
}

