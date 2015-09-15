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
		System.out.println("Hello there " + myInput + ".  How are you feeling today?");
		String feelInput;
		feelInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("I see.  You feel " + feelInput + "?  That is interesting.");
		System.out.println("I see you typed only your first name.  Can you tell me your last as well?");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is " + myInput + " " + fullName + "?");
		System.out.println("My name is Java");
		System.out.println("Shall we play a game?");
		String ansInput;
		ansInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println(ansInput + "?  Are you sure?  Then let's begin.");
	}
}
