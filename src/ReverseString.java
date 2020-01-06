//This class is meant to ask the user for an input and print out a the original string and the reversed string

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to a program that reverses the order of your words and/or phrases.");
		try
		{
			System.out.print("\nKindly enter a word or phrase you want reversed: ");
			String input = sc.nextLine();
			
			String output = reverse(input);
			
			System.out.printf("Your word/phrase reversed is: %s", output);
			
		} catch (RuntimeException e)
		{
			System.out.println("That is an inaccurate input. Please run again.");
		} catch (Exception e)
		{
			System.out.println("Kindly run again.");
		}
		

		sc.close();
	}
	
	public static String reverse(String input)
	{
		
		String output = "";
		
		for(int i = input.length() - 1; i >= 0; i--)
		{
			output = output + input.charAt(i);
		}
		
		return output;
	}

}
