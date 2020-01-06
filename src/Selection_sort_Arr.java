//This program is meant to sort an array of integers through the selection sort method
//Selection sort loops through the array and finds the smallest value after that current position and swaps the two positions.
//This is good for organizing it either in ascending or descending order

import java.util.Scanner;

public class Selection_sort_Arr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey there, I have been designed to do a bubble sort for integer values.");

		System.out.print("Kindly enter a list of numbers separate only by a single space: ");
		String input = sc.nextLine();

		String[] input_arr = input.split(" ");
		int[] integer_input;
		do
		{
			System.out.print("Do you want to see progress of the bubble sort as it loops? (Y or N):");
			input = sc.nextLine();
		} while(!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")));
		
		if(input.equalsIgnoreCase("y") == true)
		{
			 integer_input = selectsortprint(input_arr);
		} else
		{
			integer_input = selectsort(input_arr);
		}
		
		System.out.print("The final result of your bubble sort is:");
		
		for(int i = 0; i < integer_input.length; i++)
		{
			System.out.print(" " + integer_input[i]);
		}
		
		System.out.println(".\n\nThat was fun. Glad I could help. \n\nHave a good day.\nRun Again.");
		
		
		sc.close();
	}
	
	public static int[] selectsort(String[] input_arr)
	{
		int[] integer_input = new int[input_arr.length];
		
		try
		{
			for(int i = 0; i < input_arr.length; i++)
			{
				input_arr[i] = input_arr[i].trim(); //this is just in case there are multiple spaces
				integer_input[i] = Integer.parseInt(input_arr[i]);
			}

			for(int j = 0; j < integer_input.length-1 ; j++)
			{
				int min = j;				
				for(int k = j; k < integer_input.length; k++)
				{
					if(integer_input[k]<integer_input[min])
					{
						min = k;
					}
				}
				
				int temp = integer_input[j];
				integer_input[j] = integer_input[min];
				integer_input[min] = temp;
				
				
			}
		} catch(NumberFormatException e)
		{
			System.out.println("Kindly run again but only enter integer values this time, separated by a single space.");
			System.exit(0);
		}
		System.out.println(" ");
		return integer_input;
		
	}
	
	public static int[] selectsortprint(String[] input_arr)
	{
		int[] integer_input = new int[input_arr.length];
		try
		{
			for(int i = 0; i < input_arr.length; i++)
			{
				input_arr[i] = input_arr[i].trim(); //this is just in case there are multiple spaces
				integer_input[i] = Integer.parseInt(input_arr[i]);
			}

			for(int j = 0; j < integer_input.length-1 ; j++)
			{
				int min = j;
				for(int i = 0; i < integer_input.length; i++)
				{
					System.out.print(integer_input[i] + " ");
				}
				System.out.print("\n");
				
				for(int k = j; k < integer_input.length; k++)
				{
					if(integer_input[k]<integer_input[min])
					{
						min = k;
					}
				}
				
				int temp = integer_input[j];
				integer_input[j] = integer_input[min];
				integer_input[min] = temp;
				
				
			}
		} catch(NumberFormatException e)
		{
			System.out.println("Kindly run again but only enter integer values this time, separated by a single space.");
			System.exit(0);
		}
		System.out.println(" ");
		return integer_input;
		
	}
}
