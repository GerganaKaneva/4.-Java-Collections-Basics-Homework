import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(calculateFactorial(number));

    }

    public static int calculateFactorial(int n) {

        if (n == 0) {
            return  1;

        } else {

            return n * calculateFactorial(n - 1);
        }
    }
}
