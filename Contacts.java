package javasrc.org.free_code_challange;

import java.util.Scanner;

public class Contacts {
public static void main(String[] args) {
	System.out.println("Welcome to contacts app! \n please select your choice among options below \n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
			+ "press 1 for managing contacts. \n press 2 for messages. \n press 3 to quit.");
	Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();
	
	switch(x) {
		case 1:{
			System.out.println("select the operation you want to execute. \n"
					+ "1. show all conatacts \n"
					+ "2. Add new contact \n"
					+ "3. search for contact \n"
					+ "4. delete a contact \n"
					+ "5. go back");
			break;
		}
		case 2:{
			System.out.println("select your choice \n"
					+ "1. see the list of all messages \n"
					+ "2. send new message \n"
					+ "3. go back");
			break;
		}
		case 3:{
			return;
		}
		case default{
			break;
		}
	}
}
}

