package school.redrover.HW4;
/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все нечетные числа из массива.
 */

public class HW4_4 {
    public static void main(String[] args) {
        //необходимо вывести все нечетные числа из массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}



