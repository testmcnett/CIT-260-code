import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	public Harvester(String f) throws FileNotFoundException { //overloaded constructor
		mailList = new String[10];
		setFileName(f); //change 1
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		String pattern = "[A-Za-z0-9+_.-]+@([^\"? ]+)";
		File aFile = new File(fileName);
		if(!aFile.exists())
			System.out.println("problem with opening file");
		else{
			Scanner input = new Scanner(aFile);
			int counter = 0;
			while(input.hasNextLine()){
				String line = input.nextLine();
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(line);
				if(m.find()){
				/*if(line.contains("@")){
					int atPos = line.indexOf("@");
					int endPos = line.indexOf(" ", atPos);
					if (endPos == -1)
						endPos = line.length();
					int startPos = line.lastIndexOf(" ", atPos) + 1;*/
					int startPos = m.start();
					int endPos = m.end();
					String email = line.substring(startPos, endPos);
					mailList[counter] = email;
					counter++;
				}//end if
			}//end while
		}//end else
			

	}
	public String[] getMailList() {
		return mailList;
	}
	@Override
	public String toString() { //returns string representation of object
		return "Harvester [fileName=" + fileName + ", addresses=" + Arrays.toString(mailList) + "]";
	}
	public int getNumOfEmails(){ //returns the number of items in the list... or does it?
		int counter = 0;
		for(String email:mailList)
			if(email != null)
				counter++;
		
		return counter;
	}
}
