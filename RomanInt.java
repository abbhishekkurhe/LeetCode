import java.util.Scanner;
public class RomanInt {
    private static int value(char numeral) {
        switch (numeral) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:
                 return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A ROMAN number:");
        String R = sc.nextLine();
        int total = 0;
        for (int i = 0; i < R.length(); i++) {
            int current = value(R.charAt(i));
            if (i + 1 < R.length() && current < value(R.charAt(i+1))) {
                total = total - current;
            } else {

                total = total + current;
            }
        }
        System.out.println("Integer value: " + total); sc.close();
        
    }
    
}
