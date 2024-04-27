package school.redrover.HW5;
/*
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести минимальное значение массива
необходимо вывести максимальное значение массива
 */
public class HW5_6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j ++){
                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
        // необходимо вывести максимальное значение массива.
        int[][] array1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min1 = Integer.MIN_VALUE;
        for (int i = 0; i < array1.length; i ++){
            for (int j = 0; j < array1[i].length; j ++){
                if (array1[i][j] > min){
                    min = array1[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
