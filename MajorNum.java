import java.util.*;

public class MajorNum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter array size
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Enter array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                System.out.println("Majority Element: " + num);
                return;
            }
        }

        sc.close();
    }
}