// only for sorted array
import java.util.Scanner;

public class Duplicate{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter " + n + " elements in sorted order:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Remove duplicates
        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int k = i + 1;

        // Print number of unique elements
        System.out.println("Number of unique elements: " + k);

        // Print array after removing duplicates
        System.out.print("Array after removing duplicates: ");

        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }

        sc.close();
    }
}