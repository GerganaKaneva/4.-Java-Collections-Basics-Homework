import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        if (words.length == 1){

            System.out.print(words[0]);

        } else {

            for (int i = 0, j = i+1; i < words.length - 1; i++, j++) {

                if (words[i].equals(words[j])){
                    System.out.print(words[i] + " ");
                }
                else {
                    System.out.println(words[i]);
                }
                if (j == words.length - 1){
                    System.out.print(words[j]);
                }
            }
        }
    }
}
