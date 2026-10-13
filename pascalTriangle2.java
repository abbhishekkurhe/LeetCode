
import java.util.*;

public class pascaltriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter rowIndex: ");
        int rowIndex = sc.nextInt();

        // Get the required row
        List<Integer> row = getRow(rowIndex);

        // Display the result
        System.out.println("Output: " + row);

        sc.close();
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }

        return row;
    }
}
