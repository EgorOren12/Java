import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*Написать метод, который объединяет два словаря. Если ключ присутствует в обоих словарях, суммировать их значения.*/
public class zad100 {
    public static void main(String[] args) {
        Map<String,Integer> dictionary1 = new HashMap<String,Integer>(){};
        Map<String,Integer> dictionary2 = new HashMap<String,Integer>();
        Random rnd = new Random();

        dictionary1.put("Her", rnd.nextInt(10,3000));
        dictionary1.put("Byi", rnd.nextInt(10,3000));
        dictionary1.put("Pir", rnd.nextInt(10,3000));
        dictionary1.put("Mir", rnd.nextInt(10,3000));
        dictionary1.put("Dir", rnd.nextInt(10,3000));

        dictionary2.put("Ger", rnd.nextInt(10,3000));
        dictionary2.put("Zer", rnd.nextInt(10,3000));
        dictionary2.put("Pir", rnd.nextInt(10,3000));
        dictionary2.put("kiy", rnd.nextInt(10,3000));
        dictionary2.put("Dir", rnd.nextInt(10,3000));

        Map<String,Integer> fnalDictionary = new HashMap<>(dictionary1);

        for (Map.Entry<String,Integer> entry : dictionary2.entrySet()){
             fnalDictionary.merge(entry.getKey(), entry.getValue(), Integer::sum);
             }

        for (Map.Entry<String,Integer> entry1 : fnalDictionary.entrySet()){
            System.out.println(entry1.getKey() +"---"+entry1.getValue());
        }
    }
}
