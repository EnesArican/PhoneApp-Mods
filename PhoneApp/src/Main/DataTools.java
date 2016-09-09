package Main;
import java.awt.Point;

public abstract class DataTools {
	
	    String dataType;
	    int j;
	
	DataTools(String dataType){
		this.dataType = dataType;
		this.j = getRowNumber(dataType);	
	}
	
	public int getRowNumber(String dataType){	
		 switch (dataType) {
         case "Username":  return 0;
		 case "Password":  return 1;
		 default: return -1; 
		 }
	}
	
	public String getUserInput(Asker asker){
		String userInput = asker.askString("\nPlease Input " + dataType +":");
		return userInput;
	}

	//Loop Through same data type in DataMap
	public int loopDataMapRow(String Input, int j){
		
	      int i = 0; 
	      
	      do{
	      	   if (getDataString(i,j).equals(Input)){
	    		 return i; 
	    	   }else{
	    	 	 i = i + 1; 		 
	    	   }
	       }while(getDataString(i,j) != null);
	       return -1;
	   }
	
	//Returns Data value of point(i,j) in DataMap
	 public static String getDataString(int i,int j){
	     Point P = new Point(i,j);
	     String dataString = DataFileReader.DataMap.get(P);
	     return dataString;
	   }
}
