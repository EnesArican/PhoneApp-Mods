
public class PassWord extends DataTools {

	
	
    PassWord() {
		super("Password");
		// TODO Auto-generated constructor stub
		
		String PassWord = UserInput();
		int i = UserName.i;
		Check(i, PassWord);
	}
	
    public void Check(int i, String UI){
		
		if(!GetDataStr(i, j).equals(UI)){
	
			System.out.print("\nIncorrect Password!");
			System.exit(0);
		}else{
			
			System.out.print("\nPassword Correct \n");	
		}
	}
	
	
}
