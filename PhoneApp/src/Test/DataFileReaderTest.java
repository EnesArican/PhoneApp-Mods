package Test;
import static org.junit.Assert.*;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.junit.Test;
import Main.DataFileReader;


public class DataFileReaderTest {
	
	DataFileReader dataReader;
	String example;
	Scanner scan;
	
	public DataFileReaderTest(){	
		this.dataReader= new DataFileReader();
		this.example = ("Name:Enes,Ahmet,Mehmet,");
		this.scan = new Scanner(example);
	}

	@Test
	public void getDataTest() throws IOException {
		dataReader.getData(new Scanner(new File("TestFile.txt")));
		
		Point P = new Point(1,0);
		String demo = DataFileReader.DataMap.get(P);
		
		assertEquals("Mehmet" , demo);	
	}
	
	@Test
	public void insertDataTest(){
		int row = 0;
		
		dataReader.insertData(scan, row);	
		Point P = new Point(1,0);
		String demo = DataFileReader.DataMap.get(P);
		
		assertEquals("Ahmet" , demo);
	}

	@Test
	public void getRowTest() {
		String output = dataReader.getRow(scan);
		assertEquals("Enes,Ahmet,Mehmet," , output);
	}
	
	@Test
	public void getDataCountTest(){
		int output = dataReader.getDataCount(example);
		assertEquals(3 , output);
	}
}
