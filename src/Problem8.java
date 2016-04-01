import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        String letters = "([A-Za-z])+";
        Pattern pattern = Pattern.compile(letters);
        Matcher matcher = pattern.matcher(input);

        Set<String> clearedText = new TreeSet<>();

        while (matcher.find()) {
            clearedText.add(matcher.group() + " ");
            }
        // Note that 0output "java to softuni welcome" has a mistake.
        // The correct alphabetical order is: "java softuni to welcome".
        for(String item: clearedText){
            System.out.print(item);
        }
    }
}

