

import java.util.Scanner;

public class Main {
	
	public static void main(String[]Args) {
		
		System.out.println("Welcome to the PhoneBook Application");
		System.out.println();
		
		
		User UN = new User();
		UN.User_main();
		
		
		Scanner scan = new Scanner(System.in);
		String Password = PassCode(scan);
		
	
		
		System.out.println("\n Username is " + UN.UserName);
		System.out.println("\n Password is " + Password);
		
		
		
	}
	
	
	
	
	
    private static String PassCode(Scanner scan){
		
	System.out.print("Please Input Password: ");
	String Password = scan.nextLine();
		
		return Password;	
	}

}
