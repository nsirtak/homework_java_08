package school.redrover.HW4;
/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
1. необходимо вывести сумму всех значений массива.
2. необходимо вывести все нечетные числа из массива.
 */

public class HW4_4 {
    public static void main(String[] args) {
        //необходимо вывести сумму всех значений массива
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println(sum);
        //необходимо вывести все нечетные числа из массива.
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array2.length; i = i + 1) {
            if (array2[i] % 2 == 1) {
                System.out.println(array2[i]);
            }
        }
    }
}



