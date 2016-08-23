import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.mockito.Mockito;

public class DataTools_Test {
	
	@Test
	public void test_Class() {
		
		//Create the mocked instance using Mockito.mock(class) method.
		DataTools DT = Mockito.mock(DataTools.class);
		
		//Use real (=original) code when method is invoked.
		Mockito.doCallRealMethod().when(DT).Class("Password");
		
		int output = DT.Class("Password");
		 
		assertEquals(1 , output);
		
	}
	
	@Test
	public void test_LoopMapRow() {
		
		int i = 0;
		int j = 0;
				
		Scanner scan = new Scanner("HEllO:ENES,BOBBY,YETIS,");
		
		GetData GD = new GetData();
		GD.InputData(scan, j);
		
		DataTools DT = Mockito.mock(DataTools.class);
		Mockito.doCallRealMethod().when(DT).LoopMapRow("YETIS",0);
		
		int output = DT.LoopMapRow("YETIS",0);
		
		assertEquals(2 , output);
		
	}
	
	@Test
	public void test_UserInput() {
		//Not sure how to/if I need to test this//
	}
	
	@Test
	public void test_GetDataStr() {
		
		int i = 0;
		int j = 0;
				
		Scanner scan = new Scanner("HEllO:ENES,BOBBY,");
		
		GetData GD = new GetData();
		
		GD.InputData(scan, j);
		
		String output = DataTools.GetDataStr(i, j);
		
		assertEquals("ENES" , output);
		
		
	}

}
