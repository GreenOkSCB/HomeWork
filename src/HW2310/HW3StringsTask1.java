package HW2310;

import java.util.Scanner;

public class HW3StringsTask1 {
    public static void main(String[] args) {
        /*1) Найти в строке указанную подстроку и заменить ее на новую.
        Строку, ее подстроку для замены и новую подстроку вводит пользователь.
        */
        Scanner in = new Scanner(System.in);            // сканер командной строки
        System.out.println("Введите изначальную строку.");

        String strIzn = in.nextLine();                     // считываем сканером и записываем в strIzn

        System.out.println("Что ищем?: ");
        String strSearch = in.nextLine();                  // считываем сканером и записываем в strSearch

        System.out.println("На что меняем?: ");
        String strNew = in.nextLine();                  // считываем сканером и записываем в strNew

        String result = strIzn.replace(strSearch, strNew);  // в изначальной строке (strIzn) находим
                                                            // искомую строку (strSearch) и меняем на новую (strNew)
        System.out.println("Получилось: " + result);
    }
}
