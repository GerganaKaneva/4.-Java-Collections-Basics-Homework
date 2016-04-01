import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] playingCards = sc.nextLine().split("([\\W])+");

        double countOfCards = playingCards.length;
        double appearances = 1;
        double persentageAppearance = (appearances/countOfCards)*100;
        LinkedHashMap<String,Double> repetitionMap = new LinkedHashMap<>();

        for(String card: playingCards){
            if(repetitionMap.containsKey(card)){
                appearances++;
                repetitionMap.put(card, repetitionMap.get(card)+persentageAppearance);
            }else {
                repetitionMap.put(card,persentageAppearance);
            }
        }

        for (Map.Entry<String,Double> pair: repetitionMap.entrySet()){

            Character percentage = '%';
            System.out.printf("%s -> %.2f%c\n", pair.getKey().toString(),pair.getValue(), percentage);
        }
    }
}
