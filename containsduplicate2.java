import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {

                if(i - map.get(nums[i]) <= k) {
                    found = true;
                    break;
                }
            }

            map.put(nums[i], i);
        }

        System.out.println("Output: " + found);

        sc.close();
    }
}