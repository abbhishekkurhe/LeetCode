import java.util.Scanner;

public class SearchInsertPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Get target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Binary Search
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // If target is not found
        System.out.println("Target should be inserted at index: " + left);

        sc.close();
    }
}