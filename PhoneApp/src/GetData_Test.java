import static org.junit.Assert.*;

import java.awt.Point;
import java.util.Scanner;
import org.junit.Test;

public class GetData_Test {

	
	@Test
	public void test_Line() {
		
		Scanner scan = new Scanner("HEllO:ENES");
		
		GetData GD = new GetData();
		
		String output = GD.Line(scan);
		
		assertEquals("ENES" , output);
		
	}

	
	@Test
	public void test_Nbr_of_Commas(){
		
		GetData GD = new GetData();
		
		String str = ("HELLO:ENES");
		
		int output = GD.Nbr_of_Commas(str);
		
		assertEquals(0 , output);
		
	}
		
	
	@Test
	public void test_InputData(){
		
		Scanner scan = new Scanner("HEllO:ENES,BOBBY,");
		
		int row = 0;
		
		GetData GD = new GetData();
		
		GD.InputData(scan, row);
				
		Point P = new Point(1,0);
		String demo = GetData.DataMap.get(P);
		
		assertEquals("BOBBY" , demo);
		
	}
	
	
}
