import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int targetNumber = sc.nextInt();
        sc.nextLine();
        String[] inputNums = sc.nextLine().split(" ");

        List<Integer> arrayNumbers = new ArrayList<>();

        for(String n: inputNums){
            arrayNumbers.add(Integer.parseInt(n));
        }

        int low = 0;
        int high = arrayNumbers.size() - 1;
        int mid = low + (high - low)/2;
        //System.out.println(arrayNumbers.get(low));

        findNumberIndex(targetNumber, arrayNumbers, low, high, mid);
    }

    public static void findNumberIndex (int numToFind, List<Integer> numbers, int low, int high, int mid){

        if (low < high) {

            if (numToFind == numbers.get(mid)) {

                System.out.print(mid);

            } else if (numToFind > numbers.get(mid)) {
                low = mid + 1;

                if (low < high){

                high = numbers.size() - 1;
                mid = low + (high - low) / 2;
                findNumberIndex(numToFind, numbers, low, high, mid);
                }

            } else if (numToFind < numbers.get(mid)){

                    high = mid - 1;
                    mid = low + (high - low) / 2;
                    findNumberIndex(numToFind, numbers, low, high, mid);
            }
        }
        if (low == high){

            if (numToFind == numbers.get(low)) {

                System.out.print(low);

            }else {
                System.out.print("-1");
            }
        }

    }
}
