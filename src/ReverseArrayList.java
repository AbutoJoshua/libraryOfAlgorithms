//This class is meant to reverse the order of an ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to a program that reverses the order of an array list.");
		try
		{
			ArrayList<String> inputList = new ArrayList<String>();
			String inputstream = "t";
			do
			{
				System.out.print("Kindly enter a number, word or phrase (or q to quit): ");
				inputstream = sc.nextLine();
				if(!(inputstream.equalsIgnoreCase("q")))
					inputList.add(inputstream);
				
			} while(!(inputstream.equalsIgnoreCase("q")));
			
			
			ArrayList<String> output = reverse(inputList);
			
			System.out.println("\nYour original list is: ");
			for(int i = 0; i < output.size(); i++)
			{
				System.out.print(inputList.get(i)+ " ");
			}
			System.out.println("\n\nYour word/phrase reversed is: ");
			for(int i = 0; i < output.size(); i++)
			{
				System.out.print(output.get(i)+ " ");
			}
			
		} catch (RuntimeException e)
		{
			System.out.println("That is an inaccurate input. Please run again.");
		} catch (Exception e)
		{
			System.out.println("Kindly run again.");
		}
		
		System.out.println("\n\nYou can run me again for a different list.\nThank you. Have a good day.");

		sc.close();
	}
	
	public static ArrayList<String> reverse(ArrayList<String> input)
	{
		
		ArrayList<String> output = new ArrayList<String>();
		
		for(int i = 0; i < input.size() ; i++)
		{
			output.add(0, input.get(i));
		}
		
		return output;
	}

}
