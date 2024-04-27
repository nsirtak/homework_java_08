package school.redrover.HW5;
/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
 */
public class HW5_3 {
    public static void main(String[] args) {
        //необходимо вывести минимальное значение массива
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0]; //// Предполагаем, что первый элемент массива - минимальный
        //// Проходим по массиву и сравниваем каждый элемент с текущим минимальным значением
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);

        //необходимо вывести минимальное значение массива #2
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + max);
    }
}
