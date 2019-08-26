package a1;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;

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

			// One thing item may be entered twice. Need to control for that
			// A list of the items so far, only update if it's not in there?
			// Or make a SET of items, cuz sets are unique, then iterate through the set and update
			ArrayList<String> item_tracker = new ArrayList<String>();
			for (int k = 0; k < num_purchased; k++)
			{
				int number_bought = scan.nextInt();
				String item_name = scan.next();
				if (!item_tracker.contains(item_name))
					item_tracker.add(item_name);
				item_totals.put(item_name, item_totals.get(item_name) + number_bought);
			}
			// Now go through the ArrayList and update customer thingy

			for (int m = 0; m < item_tracker.size(); ++m)
			{
				item_customer_totals.put(item_tracker.get(m), item_customer_totals.get(item_tracker.get(m))+1);
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