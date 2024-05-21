package helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world !");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your firstName :");
		String firstName = keyboard.nextLine();
		
		int groupNumber;
		do {
			System.out.print("Enter you group number(1,2 ou 3): ");
			groupNumber = keyboard.nextInt();
		} while (groupNumber < 1 || groupNumber > 3);
		System.out.print("Welcome "+ firstName + " from G"+groupNumber +" to the object-Oriented Development class!");
		
		keyboard.close();
	}
};