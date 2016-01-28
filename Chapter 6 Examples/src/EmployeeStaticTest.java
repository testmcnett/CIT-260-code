/* 
Static variable
 - a variable which belongs to the class, not to object(instance)
 - static variables are initialized only once, at the start of the execution
 - a single copy is shared by all instances of the class
 - a static variable can be accessed directly by the class name and doesn’t need any object

Static method
 - method which belongs to the class, not to the object(instance)
 - can access only static data; it can not access non-static data (instance variables)
 - can call only other static methods and can not call a non-static method from it
 - can be accessed directly by the class name and doesn’t need an object

Misc Notes:
 - main method is static , since it must be be accessible for an application to run , before any instantiation takes place
 - static methods and attributes are underlined in UML */

class Employee {

    private String name;
    private double payRate;
    private final int EMPLOYEE_ID;
    
    private static int nextID = 1000;
    private static String department = "Accounting";
    
    public Employee(String name, double startingPay) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = startingPay;
    }
    
    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }
    
    public void changeDepartment(String dept){
    	department = dept;
    }

    public static String getName(){
    	return name;
    }
    
	@Override
	public String toString() {
		return "Employee [name=" + name + ", payRate=" + payRate + ", EMPLOYEE_ID=" + EMPLOYEE_ID +  ", DEPARTMENT=" + department + "]";
	}
}

public class EmployeeStaticTest {
	public static void main(String[] args) {
		Employee bob = new Employee("Bob", 14.00);
		System.out.println(bob); //should be in Accounting
		Employee ann = new Employee("Ann", 16.00);
		ann.changeDepartment("HR");
		System.out.println(ann); //should be in HR
	}
}