//This class is supposed to return the minimum value from an array list of integers
import java.util.ArrayList;
import java.util.Scanner;

public class Find_Min_ArrList {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program is meant to take a list of numbers and return the minimum value from the list");
		
		try
		{
			
			ArrayList<String> inputList = new ArrayList<String>();
			String inputstream = "t";
			do
			{
				System.out.print("Kindly enter a whole number (or q to quit): "); 
				inputstream = sc.nextLine();
				if(!(inputstream.equalsIgnoreCase("q")))
					inputList.add(inputstream);
				
			} while(!(inputstream.equalsIgnoreCase("q")));
			
			// If you want to accommodate decimals change the integer data type and adjust the rest accordingly
			ArrayList<Integer> arr_num = new ArrayList<Integer>();
			
			for(int i = 0; i < inputList.size(); i++)
			{
				//Don't forget to change how you parse this to accommodate decimals too
				int current = Integer.parseInt(inputList.get(i));
				arr_num.add(current);
			}
			
			int min = arr_num.get(0);
			
			for(int j = 1; j < arr_num.size(); j++)
			{
				if(arr_num.get(j) < min)
					min = arr_num.get(j);
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
