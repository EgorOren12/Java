/*В массиве найти элементы, которые в нем встречаются только один раз, и вывести их на экран. То есть найти и
вывести уникальные элементы массива. (LINQ использовать нельзя)*/

import java.util.Random;

public class zad9 {
    public static void main(String[] args){
        Random rnd = new Random();
        int[] nums = new int[10];
        for(int i = 0; i< nums.length;i++){
            nums[i] = rnd.nextInt(0,10);
            System.out.print(nums[i]+" ");
        }
        for(int i = 0;i<nums.length;i++){
            boolean flag = true;
            for (int j = 0;j<nums.length;j++){
                if (i!=j && nums[i] == nums[j]) flag = false;
            }
            if (flag) System.out.println(nums[i]);
        }

    }
}
