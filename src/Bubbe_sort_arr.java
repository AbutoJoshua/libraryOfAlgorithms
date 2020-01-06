//A bubble sort only loops through checking whether the next value is greater than the current value and if it is swap the position of the values
// This however does not guarantee that it is sorted in order. Only the largest number will be in the last index the way I have designed it
//Refer to the following link for further explanation https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html

import java.util.Scanner;

public class Bubbe_sort_arr
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
			 integer_input = bubblesortprint(input_arr);
		} else
		{
			integer_input = bubblesort(input_arr);
		}
		
		System.out.print("The final result of your bubble sort is:");
		
		for(int i = 0; i < integer_input.length; i++)
		{
			System.out.print(" " + integer_input[i]);
		}
		
		System.out.println(".\n\nThat was fun. Glad I could help. \n\nHave a good day.\nRun Again.");
		
		sc.close();
	}
	
	public static int[] bubblesort(String[] input_arr)
	{
		int[] integer_input = new int[input_arr.length];
		try
		{
			for(int i = 0; i < input_arr.length; i++)
			{
				input_arr[i] = input_arr[i].trim(); //this is just in case there are multiple spaces
				integer_input[i] = Integer.parseInt(input_arr[i]);
			}

			for(int j = integer_input.length-1; j >= 0 ; j--)
			{
				for(int k = 1; k <= j; k++)
				{
					if(integer_input[k-1]>integer_input[k])
					{
						int temp = integer_input[j-1];
						integer_input[j-1] = integer_input[j];
						integer_input[j] = temp;
					}
				}
			}
		} catch(NumberFormatException e)
		{
			System.out.println("Kindly run again but only enter integer values this time, separated by a single space.");
			System.exit(0);
		}
		
		return integer_input;
	}
	
	public static int[] bubblesortprint(String[] input_arr)
	{
		int[] integer_input = new int[input_arr.length];
		try
		{
			for(int i = 0; i < input_arr.length; i++)
			{
				input_arr[i] = input_arr[i].trim(); //this is just in case there are multiple spaces
				integer_input[i] = Integer.parseInt(input_arr[i]);
			}

			for(int j = integer_input.length-1; j >= 0 ; j--)
			{
				for(int k = 1; k <= j; k++)
				{
					if(integer_input[k-1] > integer_input[k])
					{
						int temp = integer_input[k-1];
						integer_input[k-1] = integer_input[k];
						integer_input[k] = temp;
						
						for(int i = 0; i < integer_input.length; i++)
						{
							System.out.print(integer_input[i] + " ");
						}
						System.out.print("\n");
					}
					
					
				}
				
				
			}
		} catch(NumberFormatException e)
		{
			System.out.println("Kindly run again but only enter integer values this time, separated by a single space.");
			System.exit(0);
		}
		
		return integer_input;
	}
}
