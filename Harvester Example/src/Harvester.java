import java.util.Arrays;

/**
 * Purpose: This program is an email harvester that will allow the user to supply a file name and parse the file for email addresses. The email addresses will be stored in an array.
 * Date: 1/11/16
 * @author Your name here
 */
public class Harvester {
	private String fileName;
	private String[] mailList;
	
	public Harvester(){ //default constructor
		fileName = "";
		mailList = new String[10];
	}
	public Harvester(String f) { //overloaded constructor
		fileName = f;
		mailList = new String[10];
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String[] getMailList() {
		return mailList;
	}
	@Override
	public String toString() { //returns string representation of object
		return "Harvester [fileName=" + fileName + ", addresses=" + Arrays.toString(mailList) + "]";
	}
	public int getNumOfEmails(){ //returns the number of items in the list... or does it?
		return mailList.length;
	}
}
