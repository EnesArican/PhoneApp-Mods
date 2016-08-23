import java.awt.Point;
import java.util.Scanner;


public abstract class DataTools {
	
	    String ClassName;
	    int j;
	
	DataTools(String ClassName){
		
		this.ClassName = ClassName;
		this.j = Class(ClassName);
		
	}
	
	//Returns Row value for data type
	public int Class(String ClassName){	
		
		 switch (ClassName) {
         case "Username":  return 0;
         
		 case "Password":  return 1;
		 
		 default: return -1; 
		 }
	}
	
	
	public String UserInput(){
		
		//Throws Exception if scanner is closed
		Scanner Sscan = new Scanner(System.in);
		
		System.out.print("\nPlease Input " + ClassName + ":");
		
		String Input = Sscan.nextLine();
		
		
		return Input;	
	}
	
	
	//Loop Through same data type in DataMap
	public int LoopMapRow(String Input, int j){

	      int i = 0;
          
	      do{
	 
	      	   if (GetDataStr(i,j).equals(Input)){
	    		 return i; 
	    	   }else{
	    	 	 i = i + 1; 		 
	    	   }
	   
	       }while(GetDataStr(i,j) != null);

	       return -1;

	   }
	
	
	//Returns Data value of point(i,j) in HashMap
	 public static String GetDataStr(int i,int j){

	     Point P = new Point(i,j);
	     
	     String DataStr = GetData.DataMap.get(P);
	     
	     return DataStr;
	     
	   }

}
