package HW2110;

public class HW2Task4 {
    public static void main(String[] args) {
        /*Задача 4
        Проверьте, является ли натуральное число — простым.
        */
        int a = 101;
        int count = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("Заданное число - составное");
        } else if (count == 2) {
            System.out.println("Заданное число - простое");
        } else {
            System.out.println("Ошибка. Введеное не число не является натуральным");
        }
    }
}
