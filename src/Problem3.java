import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        int currentCounter = 1;
        int largestCounter = 0;

        String equalElement = "";
        String nonEqualElement = "";

        if (words.length == 1) {

            System.out.print(words[0]);

        } else {

            for (int i = 0, j = i + 1; i < words.length - 1; i++, j++) {

                if (words[i].equals(words[j])) {
                    currentCounter++;

                    if (currentCounter > largestCounter) {

                        largestCounter = currentCounter;
                        equalElement = words[i];

                    }
                } else {
                    //Save the words[i] only if String nonEqualElement is still empty.
                    //This way the next nonEqualElement will not replace the first one and
                    //finally the program will print the leftmost nonEqualElement
                    // (for example: SoftUni softUni softuni, will print the first element).
                    if (nonEqualElement.equals("")) {
                        nonEqualElement = words[i];
                    }
                    currentCounter = 1;
                }
            }
        }
        //Print, if there were no equal elements:
        if (currentCounter > largestCounter) {

            System.out.print(nonEqualElement);

        } else {
            //Print, the longest equel elements:
            for (int i = 0; i < largestCounter; i++) {

                if(i != largestCounter - 1){
                    System.out.print(equalElement + " ");
                }else {
                    System.out.print(equalElement);
                }
            }
        }
    }
}