import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");
        int[] intNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(intNumbers);

        for (int i = 0; i < intNumbers.length; i++) {

            System.out.print(intNumbers[i] + " ");
        }
    }
}
