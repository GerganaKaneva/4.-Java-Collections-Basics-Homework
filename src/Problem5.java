import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String letters = "([A-Za-z])+";
        Pattern pattern = Pattern.compile(letters);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;

        while (matcher.find()) {
            //System.out.println(matcher.group() + " ");
            counter++;
        }

        System.out.println(counter);
    }
}
