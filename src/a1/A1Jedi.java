package a1;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_items = scan.nextInt();
		Map<String, Integer> item_totals = new LinkedHashMap<>();
		Map<String, Integer> item_customer_totals = new LinkedHashMap<>();

		for(int i = 0; i < num_items; i++)
		{
			String item_name = scan.next();
			double temp3 = scan.nextDouble();
			item_totals.put(item_name, 0);
			item_customer_totals.put(item_name, 0);
		}

		int num_customers = scan.nextInt();

		for(int j = 0; j < num_customers; j++)
		{
			String temp1 = scan.next();
			String temp2 = scan.next();
			int num_purchased = scan.nextInt();

			for (int k = 0; k < num_purchased; k++)
			{
				int number_bought = scan.nextInt();
				String item_name = scan.next();
				item_totals.put(item_name, item_totals.get(item_name) + number_bought);
				item_customer_totals.put(item_name, item_customer_totals.get(item_name) + 1);
			}
		}
		for(String key : item_totals.keySet())
		{
			if (item_totals.get(key) == 0)
				System.out.println("No customers bought " + key);
			else
				System.out.println(item_customer_totals.get(key) + " customers bought " + item_totals.get(key) + " " + key);
		}
	}
}