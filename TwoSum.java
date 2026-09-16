import java.util.Scanner;
public class TwoSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter a target variable");
        int target= sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter your nums:");
            array[i]=sc.nextInt();
        }
        for(int j=0;j<array.length;j++)
        {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] + array[k] == target) {
                    System.out.println("Indices of the two numbers are: " + j + " and " + k);
                    return;
                }
            }
        }
        System.out.println("No two numbers found that add up to the target.");
    }
     
}