import java.util.Scanner;

public class Prefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length() == 0) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}