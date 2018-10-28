package HW2110;

public class HW2Task2 {
    public static void main(String[] args) {
        /*Задача 2
        Создайте программу, выводящую на экран
        все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        */
        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }

    }
}
