import java.util.*;

public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");

        int currentCounter = 1;
        int largestCounter = 0;

        List<String> increasingSeq = new ArrayList<>();
        String nonIncreasingSeq = "";

        // Printing all sequences and creation of increasingSeq list:
        for (int i = 0,j = i+1; i < numbers.length - 1; i++,j++) {

            if(Integer.parseInt(numbers[j]) >  Integer.parseInt(numbers[i])){

                {
                    System.out.print((j != numbers.length - 1) ?
                            (numbers[i] + " "):(numbers[i] + " " + numbers[j]));
                }

                currentCounter++;
                if (currentCounter > largestCounter) {

                    largestCounter = currentCounter;
                    increasingSeq.add(numbers[i]);
                    increasingSeq.add(numbers[j]);

                }
            }else {

                    System.out.println((j != numbers.length - 1) ?
                            numbers[i] : numbers[j]);

                currentCounter = 1;

                if(nonIncreasingSeq.equals("")){
                    nonIncreasingSeq = numbers[i];
                }
            }
        }

        // Clearing increasingSeq from the duplicated numbers (i and j):
        Set<String> increasingSeqNoDuplicates = new TreeSet<String>();

        for (String item: increasingSeq){
            if(!increasingSeqNoDuplicates.contains(item)){
                increasingSeqNoDuplicates.add(item);
            }
        }

        //Printing the longest result:
        System.out.println();
        System.out.print("Longest: ");

        if (increasingSeq.size() > nonIncreasingSeq.length()){

            for (String item: increasingSeqNoDuplicates){

                System.out.print(item + " ");
            }
        }else {
            System.out.print(nonIncreasingSeq);
        }

    }
}

