//This class is supposed to return the minimum value from an array of integers
import java.util.Scanner;

public class Find_Min_Arr {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program is meant to take a list of numbers separated by a space and return the minimum value from the list");
		
		try
		{
			System.out.print("\nKindly enter a list of numbers (separated by a single space): ");
			String input = sc.nextLine();			
			String[] arr = input.split(" ");
			int[] arr_num = new int[arr.length];
			for(int i = 0; i < arr.length; i++)
			{
				int current = Integer.parseInt(arr[i]);
				arr_num[i] = current;
			}
			
			int min = arr_num[0];
			
			for(int j = 1; j < arr_num.length; j++)
			{
				if(arr_num[j] < min)
					min = arr_num[j];
			}
			
			System.out.printf("The minimum value in this list is %d", min);
			
		} catch(Exception e)
		{
			System.out.println("This is an incorrect input.");
		}
		
		System.out.println("\n\nYou can run me again for a different list.\nThank you. Have a good day.");		
		sc.close();

	}

}
