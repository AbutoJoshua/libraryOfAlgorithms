//This program is supposed to alphabetically organize words or phrases entered one by one in reverse 

import java.util.ArrayList;
import java.util.Scanner;

public class reverse_Alphabetic_Order_ArrList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Hey there...\nI am here to help you alphabetically organize your words or phrases in reverse alphabetical order.");

		String input = "t";
		ArrayList<String> input_list = new ArrayList<String>();

		do
		{
			System.out.print("Kindly enter a word or a phrase (or q to start organizing): ");
			input = sc.nextLine();
			if(!(input.equalsIgnoreCase("q")))
				input_list.add(input);
		} while(!(input.equalsIgnoreCase("q")));

		ArrayList<String> output = arrange(input_list);

		System.out.print("\nThe reverse alphabetical order of your list of words is: \n" + output.get(0));

		for(int i=1; i < output.size(); i++)
		{
			System.out.print(", " +output.get(i));
		}

		System.out.println(".\n\nThat was fun. Glad I could help. \n\nHave a good day.\nRun Again.");


		sc.close();
	}

	public static ArrayList<String> arrange(ArrayList<String> input)
	{
		String current = "0000000000000000000000000000000";
		int count = 0;
		ArrayList<String> output = new ArrayList<String>();
		do
		{
			for(int i = 0; i < input.size(); i++)
			{
				for(int j = 0; j < input.size(); j++)
				{
					if(input.get(j).compareTo(current) > 0)
					{
						current = input.get(j);
						count = j;
					}

				}

				output.add(current);
				input.remove(count);

				current = "0000000000000000000000000";

			}
		}while (input.size() > 0);
		

		return output;
	}
}
