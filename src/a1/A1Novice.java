package a1;

import java.util.Scanner;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_customers = scan.nextInt();

		String[] first_names = new String[num_customers];
		String[] last_names = new String[num_customers];
		double[] total_cost = new double[num_customers];

		for(int i = 0; i < num_customers; ++i)
		{
			first_names[i] = scan.next();
			last_names[i] = scan.next();
			int items_bought = scan.nextInt();
			double sum = 0;

			for(int j = 0; j < items_bought; ++j)
			{
				double  number = scan.nextDouble();
				String item = scan.next();
				double cost = scan.nextDouble();
				sum += number*cost;
			}

			total_cost[i] = sum;
		}

		for(int k = 0; k < num_customers; ++k)
		{
			System.out.println(first_names[k].charAt(0) + ". " + last_names[k] + ": " + String.format("%.2f", total_cost[k]));
		}
	}
}
