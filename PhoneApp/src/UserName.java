
public class UserName extends DataTools {
	
	public static int i;

	UserName() {
		super("Username");
		// TODO Auto-generated constructor stub
		
		String UserName = UserInput();
		 i = Check(UserName);
	}

	public int Check(String UI){
		
		int i = LoopMapRow(UI, j);
		
		if(i == -1){
	
			System.out.print("\n" + ClassName + " Not Present in Database.");
			System.exit(0);
		}else{
			
			System.out.print("\n" + ClassName + " Found. \n");	
			return i;
		}
		
		return -1;
		
	}
	
	
}
