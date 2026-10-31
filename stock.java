import java.util.Scanner;

public class stock {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of days: ");
    int n = sc.nextInt();

    int[] prices = new int[n];

    System.out.println("Enter stock prices:");

    for (int i = 0; i < n; i++) {
        prices[i] = sc.nextInt();
    }

    int buyStock = prices[0];
    int max = 0;

    for (int i = 1; i < prices.length; i++) {

        if (buyStock > prices[i]) {
            buyStock = prices[i];
        } 
        else {
            int profit = prices[i] - buyStock;

            if (profit > max) {
                max = profit;
            }
        }
    }

    System.out.println("Maximum Profit: " + max);

    sc.close();
}

}