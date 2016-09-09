package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static int idNumber; // ID number of user
	
	public static void main(String[]Args) throws FileNotFoundException {
		
		String enteredUsername;    // User name entered by user
		String enteredPassword;    // Password entered by user
		
		System.out.println("Welcome to the PhoneBook Application");
		
		DataFileReader fileReader = new DataFileReader();
		fileReader.getData(new Scanner(new File("Database.txt")));
		
		//Get User name
	    Username username = new Username();
	    enteredUsername = username.getUserInput(new Asker(System.in,System.out));
	    idNumber = username.checkInput(enteredUsername);
	    
	    //Get Password
	    Password password = new Password();
	    enteredPassword = password.getUserInput(new Asker(System.in,System.out));
	    password.validate(idNumber, enteredPassword);
	}
}











		
	
		
    	
    


