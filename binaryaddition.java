import java.util.Scanner;
public class binaryaddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary string: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary string: ");
        String b = sc.nextLine();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if(i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);

            carry = sum / 2;
        }

        System.out.println("Binary Sum: " + result.reverse().toString());

        sc.close();
    }
}