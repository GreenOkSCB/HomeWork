package HW2310;

public class HW3Task1 {
    public static void main(String[] args) {
        /*Задача 1
        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
                */
        int val = 0; // посчитаем размер массива
        for (int y = 2; y <= 20; y += 2) {
            val++;
        }
        System.out.println(val);

        int[] evenArr = new int[val];
        for (int i = 0; i < evenArr.length; i++) {
            evenArr[i] = i * 2 + 2;             // без "+ 2" не работает, почему????
            System.out.print(evenArr[i] + " ");
        }
//        System.out.print(evenArr[i] + " ");    // почему вне цикла мы не можем использовать evenArr
                                                //  а в следующем цикле можем???
        System.out.println();
        for (int i = 0; i < evenArr.length; i++) {
            System.out.println(evenArr[i]);
        }


    }
}
