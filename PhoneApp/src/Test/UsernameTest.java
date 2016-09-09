package Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

import Main.DataFileReader;
import Main.Username;


public class UsernameTest {
	
	Username username;
	DataFileReader dataReader;
	String example;
	Scanner scan;
	
	public UsernameTest(){
		this.username = new Username();
		this.dataReader= new DataFileReader();
		this.example = ("Name:Enes,Ahmet,Mehmet,");
	    this.scan = new Scanner(example);
	 	 
	 	dataReader.insertData(scan, 0);
	}
	
	@Test
	public void checkInputTest() {
		//Print string to outContent stream instead of terminal
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
		int output = username.checkInput("Mehmet");
		assertEquals(2, output);
		
		String expectedOutput  = "\nUsername Found. \n";
		assertEquals(expectedOutput, outContent.toString());
	}
}
