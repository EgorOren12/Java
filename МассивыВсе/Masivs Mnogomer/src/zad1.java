import java.util.Random;
import java.util.Scanner;

/*У пользователя в консоли запрашивается число n, генерируется квадратный массив целых числе [n*n]. Заполнение случайными
числами в диапазоне от 10 до 99 включительно. После вывода на консоль сгенерированного массива у пользователя запрашиваются
номера строк для замены местами. После чего без очищения консоли выводится обновленный массив, где строки, поменявшиеся
места выделены красным фоновым цветом  */
public class zad1 {
   public static  final String ANSI_RED = "\u001B[41m";//цвета
    public static  final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        int[][] nums = new int[n][n];
        for(int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums[0].length;j++){
                nums[i][j] = rnd.nextInt(10,100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        int a,b;
        System.out.println("\nВведите номер первой строки");
        a = scan.nextInt();
        System.out.println("\nВведите номер второй строки");
        b = scan.nextInt();
        int[] aArray = nums[a-1]; int[] bArray = nums[b-1];
        for(int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums[0].length;j++){

                if (i == a-1) {
                    nums[i] = bArray;
                    System.out.print(ANSI_RED+nums[i][j] + " "+ANSI_RESET);continue;//замена цвета и вывод
                }
                else if (i == b-1) {
                    nums[i] = aArray;
                    System.out.print(ANSI_RED+nums[i][j] + " "+ANSI_RESET);continue;
                }

                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


    }
}