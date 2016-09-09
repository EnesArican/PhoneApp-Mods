package Main;
public class Username extends DataTools {
	
	public Username() {
		super("Username");
		// TODO Auto-generated constructor stub
	}

	public int checkInput(String userInput){ //Check if user name is present in database
		int i = loopDataMapRow(userInput, j);
		
		if(i == -1){
			System.out.print("\n" + dataType + " Not Present in Database.");
			System.exit(0);
		}else{		
			System.out.print("\n" + dataType + " Found. \n");	
			return i;
		}
		return -1;
	}	
}
