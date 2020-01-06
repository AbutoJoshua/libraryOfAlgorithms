//This is a class meant to reverse the order of an array

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to a program that reverses the order of an array.");
		try
		{
			System.out.print("\nKindly enter what you want to use as a separator: ");
			String separator = sc.nextLine();
			
			System.out.print("\nKindly enter a list of words or numbers (separated by '" + separator + "') whose order you want reversed: ");
			String input = sc.nextLine();
			
			String[] arr = input.split(separator);
			
			String[] output = reverse(arr);
			
			System.out.print("\nYour word/phrase reversed is: " + output[0]);
			for(int i = 1; i < output.length; i++)
			{
				System.out.print(separator + output[i]);
			}
			
		} catch (RuntimeException e)
		{
			System.out.println("That is an inaccurate input. Please run again.");
		} catch (Exception e)
		{
			System.out.println("Kindly run again.");
		}
		

		sc.close();
	}
	
	public static String[] reverse(String[] input)
	{
		
		String[] output = new String[input.length];
		int count = 0;
		for(int i = input.length - 1; i >= 0; i--)
		{
			output[i] = input[count];
			count++;
		}
		
		return output;
	}


}
