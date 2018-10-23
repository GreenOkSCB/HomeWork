package HW2110;

public class HW2Task3 {
    public static void main(String[] args) {
        /*Задача 3*
            Создайте программу, выводящую на экран первые
             20 элементов последовательности 2 4 8 16 32 64 128 ….
             */
        /*  */
        int w = 2;
        for (int q = 0; q < 21; q++) {
            System.out.print(w + " ");
            w *= 2;
        }
    }
}
