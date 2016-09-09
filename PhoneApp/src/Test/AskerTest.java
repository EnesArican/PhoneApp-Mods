package Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import Main.Asker;

public class AskerTest {

	@Test
	public void askIntegerTest() {
		 Asker asker = mock(Asker.class);
		 when(asker.askInteger(anyString())).thenReturn(3);
		 int output = asker.askInteger("Get number three");
		 
		 assertEquals(output, 3);	 
	}
	
	@Test
	public void askStringTest() {
		 Asker asker = mock(Asker.class);
		 when(asker.askString(anyString())).thenReturn("Hello");
		 String output = asker.askString("Say Hello");
		 
		 assertEquals(output, "Hello");
	}
}
