import java.util.Scanner;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Unique elements: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}