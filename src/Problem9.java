import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().toLowerCase().split("[\\W]+");

        int currentCounter = 1;
        int largestCounter = 0;
        List<String> equalElement = new ArrayList<>();

        Arrays.sort(input);

        for (int i = 0, j = i + 1; i < input.length - 1; i++, j++){

            if (input[i].equals(input[j])){
                currentCounter++;

                if (currentCounter > largestCounter){

                    if(equalElement.contains(input[i])){
                        largestCounter++;
                        equalElement.remove(input[i-2]);

                    }else {
                        largestCounter = currentCounter;
                        equalElement.add(input[i]);

                    }

                }else if (currentCounter == largestCounter){
                    equalElement.add(input[i]);

                }

            }else {
                currentCounter = 1;
            }
        }

        for (String element: equalElement){
            System.out.println(element + " -> " + largestCounter + " times");
        }
    }
}
