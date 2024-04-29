package school.redrover.HW6;
/*
Необходимо написать 4 метода:
● сложение 2х чисел
● вычитание 2х чисел
● умножение 2х чисел
● деление 2х чисел
 */
public class HW6_5 {
    public static double getSum(double a, double b) {
        return a + b;
    }
    public static double getDeducted(double a, double b) {
        return a - b;
    }
    public static double getDevided(double a, double b) {
        return a / b;
    }
    public static double getMulti(double a, double b) {
        return a * b;
    }
    public static void main(String [] args) {
        System.out.println(getSum(6, 3));
        System.out.println(getDeducted(6, 3));
        System.out.println(getDevided(6, 3));
        System.out.println(getMulti(6, 3));
    }
}
