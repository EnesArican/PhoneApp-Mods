import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class User_Test {

	
	@Test
	public void test_UnExists() throws IOException {
		
		User test = new User();
		
		boolean output = test.UnExists();
		
		assertEquals(true,output);
			
	}
}
