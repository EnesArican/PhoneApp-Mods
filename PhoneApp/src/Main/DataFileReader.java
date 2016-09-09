package Main;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataFileReader {
	
   public static Map<Point,String> DataMap = new HashMap<Point,String>();
	
   public void getData(Scanner dataFile){
	   int j = 0; //Row number
		
	   while (dataFile.hasNextLine()){ 
			insertData(dataFile,j);
			j = j + 1;
		}
	   
	   
	   /*
		try{
			Scanner Fscan = new Scanner(new File("Database.txt"));
				while (Fscan.hasNextLine()){ 
					insertData(Fscan,j);
					j = j + 1;
				}
				Fscan.close();
			}catch(Exception e){
				System.out.println("Could not find file " + e);			
		}
		*/
   }
	 
   public void insertData(Scanner Fscan, int j){	     
	String dataString;
	String Line = getRow(Fscan); //Get line from text file  	
	int comma;
	int previousComma = 0;
  	int dataCount = getDataCount(Line); //Number of data values in the selected line
   	 
	 //Loop text file Line - Add each data string into DataMap
	 for (int i = 0; i < dataCount; i++){ 
		comma = Line.indexOf(",", previousComma);
		dataString = Line.substring(previousComma, comma);
		previousComma = comma + 1;
		
		DataMap.put(new Point(i,j), dataString);
	 }
   }
	  
   public String getRow(Scanner Fscan){
		Fscan.findInLine(":");    
	    return Fscan.nextLine(); 
   }
	 
   public int getDataCount(String Line){
		int commaCount = Line.replaceAll("[^,]" , "").length();
		return commaCount; 
   }	 	 
}
