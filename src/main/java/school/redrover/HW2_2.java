package school.redrover;

/*Задача №2
Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
Вывести на экран кому сколько пиастров полагается.
Дополнительное задание со звездочкой
Попробовать придумать как программа может проверить правильность дележа.
from 07
 */
public class HW2_2 {
    public static void main(String[] args) {
        int totalLoot = 500; //piastrs
        int crewSize = 25; //pirates

        int ownerShare = totalLoot / 2;
        int capitanShare = (totalLoot - ownerShare) / 2;
        int commonShare = (totalLoot - ownerShare - capitanShare) / crewSize;

        int totalDistributed = ownerShare + capitanShare + commonShare * crewSize;

        System.out.print("common pirate:");
        System.out.println(commonShare);
        System.out.print("captain: ");
        System.out.println(capitanShare + commonShare);
        System.out.print("owner: ");
        System.out.println(ownerShare);
        System.out.print("TOTAL: ");
        System.out.println(totalDistributed);
        System.out.print("LEFT : ");
        System.out.println(totalLoot - totalDistributed);









    }
}
