package Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.Scanner;
import org.junit.Test;
import Main.DataTools;
import Main.Asker;
import Main.DataFileReader;

public class DataToolsTest {
	
	DataFileReader dataReader;
	String example;
	Scanner scan;
	DataTools tools;
	
	public DataToolsTest(){
		this.dataReader= new DataFileReader();
		this.example = ("Name:Enes,Ahmet,Mehmet,");
		this.scan = new Scanner(example);
		this.tools = mock(DataTools.class);
		
		//insert example string into DataMap
		dataReader.insertData(scan, 0);
	}
	
	@Test
	public void getRowNumberTest(){
        int output = tools.getRowNumber("Username");
        assertEquals(0, output);
	}
	
	@Test
	public void getUserInputTest() {
		// Note: You can do test without mock but mock makes it
        //       much easier and possible with shorter code.
        Asker asker = mock(Asker.class);
        when(asker.askString(anyString())).thenReturn("Bob");
        
        doCallRealMethod().when(tools).getUserInput(asker);   
        String output = tools.getUserInput(asker);
     
        assertEquals("Bob", output);
	}
	
	@Test
	public void loopDataMapRowTest(){
		doCallRealMethod().when(tools).loopDataMapRow("Ahmet", 0);
		int output = tools.loopDataMapRow("Ahmet", 0);
		assertEquals(1 , output);
	}
	
	@Test
	public void getDataStringTest() {
		String output = DataTools.getDataString(0, 0);
		assertEquals("Enes" , output);
	}
}
