package school.redrover;
/*
Задача №1
Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание,
деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.
*/

public class HW2_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.print("a + b = ");
        System.out.println(a + b);

        System.out.print("a - b = ");
        System.out.println(a - b);

        System.out.print("a * b = ");
        System.out.println(a * b);

        System.out.print("деление целочисленных переменных толькой с целой частью от деления a / b = ");
        System.out.println(a / b);

        System.out.print("деление целочисленных переменных с остатком a / b = ");
        System.out.println(a * 1.0 / b);

        System.out.print("остаток от деления a / b = ");
        System.out.println(a % b);

        System.out.println("a is odd:" + a % 2);
        System.out.println("b is odd:" + b % 2);

    }
}
