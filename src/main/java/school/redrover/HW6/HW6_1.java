package school.redrover.HW6;
/*
Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
 */
public class HW6_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'о'){
                System.out.println(s.charAt(i));
            }
        }
    }
}
