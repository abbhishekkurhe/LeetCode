import java.util.Scanner;

public class containsduplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean duplicate = false;

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(duplicate) {
                break;
            }
        }

        if(duplicate) {
            System.out.println("Output: true");
        }
        else {
            System.out.println("Output: false");
        }

        sc.close();
    }
}