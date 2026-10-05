import java.util.Scanner;

public class plusone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        // Create array
        int[] digits = new int[n];

        // Take array input
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Plus One logic
        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                break;
            }

            digits[i] = 0;

            // If we reached the first digit
            if (i == 0) {
                int[] result = new int[n + 1];
                result[0] = 1;

                digits = result;
            }
        }

        // Print result
        System.out.print("Result: ");

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        sc.close();
    }
}