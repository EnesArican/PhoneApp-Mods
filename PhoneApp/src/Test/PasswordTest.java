package Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

import Main.DataFileReader;
import Main.Password;


public class PasswordTest {

	Password password;
	DataFileReader dataReader;
	String example;
	Scanner scan;
	
	
	public PasswordTest(){
		this.password = new Password();
		this.dataReader= new DataFileReader();
		this.example = ("Password:p3ncil,Hell0,0lla,");
	    this.scan = new Scanner(example);
	 	 
	 	dataReader.insertData(scan, 1);
	}
	
	@Test
	public void validateTest() {
		//Print string to outContent stream instead of terminal
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
			    
		password.validate(2, "0lla");		
		String expectedOutput  = "\nPassword Correct \n";
		assertEquals(expectedOutput, outContent.toString());	
	}
}




