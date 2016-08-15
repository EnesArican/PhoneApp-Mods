import java.io.File;
import java.util.Scanner;

public class User {

	String UserName;
	Scanner Sscan = new Scanner(System.in);
	
	
	/* CONSTRUCTOR - Not needed atm
	 * 
	 *  public User(UserName){
	 *this.UserName = UserName 
     *}
     */	
	
	
    public void User_main(){
		
		UserName = InputUser(Sscan);
		Check();	
	}
	
    
	//Read user name.
    public String InputUser(Scanner scan){
		
		System.out.print("Please Input Username: ");
		String userName = scan.nextLine();
		
		return userName;	
	}
	
    
    //Check if user name is present in database.
	public void Check() {
		
	if (!UnExists()){
		System.out.print("Username not present in Database.");	
		System.exit(0);
		
	}else{
		
		System.out.println("Username found! :)");
	}	
	}
	
	
	
	public Boolean UnExists() {
		
		try{
		
			Scanner Fscan = new Scanner(new File("Database.txt"));
			
			Fscan.findInLine("UserNames:");
			String Line = Fscan.nextLine();
			
			Fscan.close();
			
			return (Line.contains(UserName))? true:false;	
				
		}catch(Exception e){
			System.out.println("Could not find file");
			return false;
		}		
	}
	
	
}
	
	
	
	
	
	



