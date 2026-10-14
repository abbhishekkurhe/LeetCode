
import java.util.Scanner;

public class needle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter the string to find: ");
        String needle = sc.nextLine();

        int result = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                result = i;
                break;
            }
        }

        System.out.println("First occurrence index: " + result);

        sc.close();
    }
}
