import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] inputOne = sc.nextLine().replace(" ", "").toCharArray();
        char[] inputTwo = sc.nextLine().replace(" ", "").toCharArray();

        List<Character> l1 = new ArrayList<Character>();
        List<Character> l2 = new ArrayList<Character>();

        for (int i = 0; i < inputOne.length; i++) {

            l1.add(inputOne[i]);
        }
        for (int i = 0; i < inputTwo.length; i++) {

            l2.add(inputTwo[i]);
        }
        l2.removeAll(l1);

        for (Character c: l1){
            System.out.print (c + " ");
        }
        for (Character c: l2){
            System.out.print (c + " ");
        }
    }
}
