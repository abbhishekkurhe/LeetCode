import java.util.Scanner;

public class mergesortedarrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter size of nums1
        System.out.print("Enter size of nums1: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m];

        System.out.println("Enter elements of nums1 in sorted order:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Enter size of nums2
        System.out.print("Enter size of nums2: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2 in sorted order:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Create a new array with space for both arrays
        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both sorted arrays
        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of nums1
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements of nums2
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        // Print merged array
        System.out.println("Merged array:");

        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }

        sc.close();
    }
}