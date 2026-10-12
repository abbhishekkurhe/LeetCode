import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    System.out.print("Enter number of rows: ");
    int numRows = sc.nextInt();

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>();

        // First element of every row is 1
        row.add(1);

        // Calculate the middle elements
        for (int j = 1; j < i; j++) {
            int sum = result.get(i - 1).get(j - 1)
                     + result.get(i - 1).get(j);

            row.add(sum);
        }

        // Last element of every row is 1
        if (i > 0) {
            row.add(1);
        }

        // Add the completed row to the triangle
        result.add(row);
    }

    // Print Pascal's Triangle
    System.out.println("Pascal's Triangle:");

    for (List<Integer> row : result) {
        System.out.println(row);
    }

    sc.close();
}


}
