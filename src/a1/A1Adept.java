package a1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int num_items = scan.nextInt();
		Map<String, Double> items = new HashMap<>();

		for(int i = 0; i < num_items; ++i)
		{
			String item_name = scan.next();
			double price = scan.nextDouble();
			items.put(item_name, price);
		}

		int num_customers = scan.nextInt();

		String[] first_names = new String[num_customers];
		String[] last_names = new String[num_customers];
		double[] total_cost = new double[num_customers];

		for(int k = 0; k < num_customers; ++k)
		{
			first_names[k] = scan.next();
			last_names[k] = scan.next();
			int items_bought = scan.nextInt();

			double total = 0;
			for(int j = 0; j < items_bought; ++j)
			{
				int number = scan.nextInt();
				String item = scan.next();
				total += number * items.get(item);
			}
			total_cost[k] = total;
		}

		double sum = 0;
		for (double cost:total_cost) sum += cost;
		double average = sum / (double)total_cost.length;

		int maxIndex = 0;
		double max = 0;
		int minIndex = 0;
		double min = sum;

		for(int m = 0; m < total_cost.length; ++m)
		{
			if (total_cost[m] > max)
			{
				max = total_cost[m];
				maxIndex = m;
			}
			if (total_cost[m] < min)
			{
				min = total_cost[m];
				minIndex = m;
			}
		}
		//String max_name = first_names[maxIndex] + " " + last_names[maxIndex];
		//String min_name = first_names[minIndex] + " " + last_names[minIndex];

		// Now just need to use indexes to get the names and costs, then print everything
		System.out.println("Biggest: " + first_names[maxIndex] + " " + last_names[maxIndex] + " (" + String.format("%.2f", total_cost[maxIndex]) + ")");
		System.out.println("Smallest: " + first_names[minIndex] + " " + last_names[minIndex] + " (" + String.format("%.2f", total_cost[minIndex]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}
