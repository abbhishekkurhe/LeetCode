import java.util.Scanner;

class lengthlastword {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string:");
    String s = sc.nextLine();

    Solution sol = new Solution();
    int result = sol.lengthOfLastWord(s);

    System.out.println("Length of last word: " + result);

    sc.close();
}


}

class Solution {
public int lengthOfLastWord(String s) {
s = s.trim();
String[] words = s.split("\s+");
    return words[words.length - 1].length();
}

}
