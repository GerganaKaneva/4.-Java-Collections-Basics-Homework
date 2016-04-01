import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String targetWord = sc.nextLine().toLowerCase();

        String letters = "([A-Za-z])+";
        Pattern pattern = Pattern.compile(letters);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;

        while (matcher.find()) {
            if(matcher.group().equals(targetWord)){
                counter++;
            };
        }

        System.out.println(counter);
    }
}
