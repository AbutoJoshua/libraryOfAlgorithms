//This class is meant to arrange an array of string values in alphabetic order

import java.util.Scanner;

public class Alphabetic_Order_Arr 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The program below is set to take a list of words or words in a sentence and rearrange it in alphabetical order.");
		
		System.out.print("\nKindly enter a list of words in the form of a sentence only separated by single space:");
		String input = sc.nextLine();
		
		String[] input_arr = input.split(" ");
		
		String[] output = arrange(input_arr);
		
		System.out.print("\nThe alphabetical order of your sentence or list of words is: \n");
		
		for(int i=0; i < output.length; i++)
		{
			System.out.print(output[i]+" ");
		}
		
		System.out.println("\n\nThat was fun. Glad I could help. \n\nHave a good day.\nRun Again.");
		
		sc.close();
	}
	
	public static String[] arrange(String[] input_arr)
	{
		String current = input_arr[0];
		
		String[] output = new String[input_arr.length];
		
		for(int i = 0; i < input_arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j < input_arr.length; j++)
			{
				if(input_arr[j].compareTo(current) < 0)
				{
					current = input_arr[j];
					count = j;
				}
					
			}
			
			output[i] = current;
			
			input_arr[count] = "zzzzzzzzzzzzzzzzz"; //This assumes that they will not have anything more than this to nullify the compare to
			
			current = "zzzzzzzzzzz"; //This assumes that they will not have anything more than this to nullify the compare to
		}
		
		return output;
	}
}
