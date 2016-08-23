import java.awt.Point;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetData {
	
	public static Map<Point,String> DataMap = new HashMap<Point,String>();
	
	
    GetData(){
	   
	 //Row number
	   int j = 0; 
		 		 
		try{
			Scanner Fscan = new Scanner(new File("Database.txt"));
							
				while (Fscan.hasNextLine()){
					 
					InputData(Fscan,j);
					
					j = j + 1;
				}
			
				Fscan.close();
				
			}catch(Exception e){
				System.out.println("Could not find file " + e);			
		}	 
   }
	 
	 
   public void InputData(Scanner Fscan, int j){
		     
	//Get line from text file   
	String Line = Line(Fscan); 
		
	
	//Number of data values in the selected line
  	int Nbr_of_DataStr = Nbr_of_Commas(Line);
		 
  	String DataStr;
    int Comma;
	int PrevComma = 0;
		 
		 
	 //Loop text file Line 
		 
	 for (int i = 0; i < Nbr_of_DataStr; i++){
			 
		Comma = Line.indexOf(",", PrevComma);
			 
		DataStr = Line.substring(PrevComma, Comma);
			 
		PrevComma = Comma + 1;
		
		DataMap.put(new Point(i,j), DataStr);
			 	 
	 }
		 	
	 
   }
	 
	 
	 public String Line(Scanner Fscan){
		 
		 Fscan.findInLine(":");
		    
	     return Fscan.nextLine();
		 
	 }
	 
	 public int Nbr_of_Commas(String Line){
		
		 int Nbr_of_Commas = Line.replaceAll("[^,]" , "").length();
		 
		return Nbr_of_Commas; 
		 
	 }
	 	 
}
