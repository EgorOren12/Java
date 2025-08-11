/*В массиве хранятся сведения о количестве осадков за месяц (30 дней). Необходимо определить общее
количество осадков, выпавших за каждую декаду месяца, вывести день с самыми сильными осадками за месяц и
отдельно вывести дни без осадков. Массив с осадками заполнятся с помощью рандома в диапазоне от 0 – нет
осадков, до 300 мм выпавших осадков.*/


import java.util.Random;

public class Zadacha5 {
    public static void main(String[] args) {
    int[] osadki = new int[30];

    int obs = 0, first = 0, second = 0, third = 0;
    int maxday = 0;

        Random rnd = new Random();
        for (int i = 0;i<osadki.length;i++){
            osadki[i] = rnd.nextInt(0, 300);
            System.out.print(osadki[i] +" ");
            obs += osadki[i];
            if(maxday < osadki[i]){
                maxday = osadki[i];
            }

            if(i+1<=10) first+= osadki[i];
            else if (i+1 >10 && i+1 <=20) second+= osadki[i];
            else third+= osadki[i];
        }
        System.out.println("\n\nОбщее кол-во осадков - "+ obs);
        System.out.println("Общее кол-во осадков за первую декаду - " + first);
        System.out.println("Общее кол-во осадков за вторую декаду - " + second);
        System.out.println("Общее кол-во осадков за третью декаду - " + third);
        System.out.println("День с самыми сильныи осадками - "+ maxday);
        String str = "";
        for (int i = 0;i<osadki.length;i++){
            if (osadki[i] == 0) str = str + (i+1) + " ";
        }
        if (str.equals("") )
        {
            System.out.println("Дней без осадков нет");
        }
        else System.out.println("Дни без осадков - " + str);
    }
}