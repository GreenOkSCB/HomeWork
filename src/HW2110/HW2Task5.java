package HW2110;

public class HW2Task5 {
    public static void main(String[] args) {
        /*Задача 5
        Выведите на экран первые 11 членов последовательности Фибоначчи.
        Первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
        */
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
        int a = 1;
        int b = 1;
        for (int i = 1; i < 12; i++) {
            int c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }
}
