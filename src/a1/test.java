package a1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class test
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        // Your code follows here.

        int num_items = scan.nextInt();
        Map<String, Double> items = new HashMap<>();

        for (int i = 0; i < num_items; ++i)
        {
            String item_name = scan.next();
            double price = scan.nextDouble();
            items.put(item_name, price);
            System.out.println(items.get(item_name));
        }

        int num_customers = scan.nextInt();
        String[] first_names = new String[num_customers];
    }
}