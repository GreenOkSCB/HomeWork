package HW2610.calculator;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        Operation plus = new Plus(a, b);
        System.out.println("Сложение дает результат = " + plus.execute(a, b));

        Operation minus = new Minus(a, b);
        System.out.println("Вычитание дает результат = " + minus.execute(a, b));

        Operation delenie = new Delenie(a, b);
        System.out.println("Деление дает результат = " + delenie.execute(a, b));

        Operation umnojenie = new Umnojenie(a, b);
        System.out.println("Умножение дает результат = " + umnojenie.execute(a, b));
    }
}
