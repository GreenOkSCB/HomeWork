package HW2610.calculator;

public class Delenie extends Operation {
    public Delenie(int a, int b) {
    }

    @Override
    public int execute(int a, int b){


        if (b != 0) {
            return  a / b;
        } else
            System.out.println("На ноль делить нельзя!");
            return b;
    }
}

