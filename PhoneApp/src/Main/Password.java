package Main;
public class Password extends DataTools {

	
	
    public Password() {
		super("Password");
		// TODO Auto-generated constructor stub
		
		//String PassWord = UserInput();
		//int i = Username.i;
		//Check(i, PassWord);
	}
	
    public void validate(int i, String userInput){
    	
		if(!getDataString(i, j).equals(userInput)){
			System.out.print("\nIncorrect Password!");
			System.exit(0);
		}else{
			System.out.print("\nPassword Correct \n");	
		}
	}
	
	
}
