package Main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

//Wrapper class for input/output
public class Asker {

   private final Scanner Scan;
   private final PrintStream out;

   //Constructor
   public Asker(InputStream in, PrintStream out){  
	    Scan = new Scanner(in);
	    this.out = out;
   }

	   
   //Return Integer from terminal
   public int askInteger(String message) {   
	    out.println(message);
	    return Scan.nextInt();
   }

	    
   //Return String from terminal
   public String askString(String message){
	    out.print(message);
	    return Scan.nextLine();
   }
}
