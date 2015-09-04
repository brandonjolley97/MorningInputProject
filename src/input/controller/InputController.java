package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section for instance variables.
	//Data members are always private
	public Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	public void start()
	{
		questions();
	}
	private void questions()
	{
		System.out.println("Please type in your name");
		String myInput;
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hello there " + myInput + ".  Shall we play a game?");
		System.out.println("I see you typed only your first name.  Can you tell me your last as well?");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is " + myInput + " " + fullName + "?");
		System.out.println("My name is Java");
		System.out.println("How old are you?");
		int age = inputScanner.nextInt();
		System.out.println("You are " + age + " years old?  Perfect.");
	}
}
