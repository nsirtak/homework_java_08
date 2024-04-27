package school.redrover.HW5;
/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
 */
public class HW5_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i ++){
            sum = sum + array[i];
        }
        System.out.println(sum * 1.0 / array.length ); //or you can make double sum = 0; on line 10
    }
}
