import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Take array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take value to remove
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        // Remove elements
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Print result
        System.out.println("Number of elements remaining: " + k);

        System.out.print("Array after removing " + val + ": ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}