package HW1810;

public class HW1 {
    public static void main(String[] args) {
        /*Задача 1:
    Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь.
    Узнайте, что больше: ширина или высота и выведите информацию об этом в консоль.*/

//        int heightRect = 17;
//        int lengthRect = 34;
//        int widthRect = 21;
//
//        int squareRect  = 2 * (heightRect * lengthRect + heightRect * widthRect + lengthRect * widthRect);
//        System.out.println("Площадь прямоугольника = " + squareRect);
//
//        int a = lengthRect;
//        int b = widthRect;
//        int c = ( a > b) ? lengthRect : widthRect;
//        System.out.println(c);
//
//        String lrLarger = "Длина больше ширины";
//        String wrLarger = "Ширина больше длины";
//        String larger = ( widthRect > lengthRect) ? wrLarger : lrLarger;
//        System.out.println(larger);

        /*Задача 2:
        На садовом участке площадью 10 соток , разбили грядки 15 на 25 метров. Сколько м2 осталось незанято?*/

//        int a = 10;
//        int b = 15;
//        int c = 25;
//        int sotka = a * a;
//        int dacha = sotka * 10;
//        int gryadka = b * c;
//        int freeEarth = dacha % gryadka;
//        System.out.println("Осталось невозделанной землицы = " + freeEarth + " м2.");

        /*Задача 3:
        Найдите площадь овального кольца, полученного из овала площадью 15 дм2 вырезанием овала площадью 600 см2.*/

//        int bigEllipse = (15 * 100);
//        int smallEllipse = 600;
//        int sRing = bigEllipse - smallEllipse;
//        System.out.println("Площадь кольца = " + sRing + " см2.");

        /*Задача 4:
        Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n.
                Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
                Метод Math.abs(n) возвращает абсолютное значение числа (модуль числа). */

//        float m = 5.55f;
//        float m1 =  m - 10;
//        float n = 13.8f;
//        float n1 = n - 10;
//
//        if ( Math.abs(m1) < Math.abs(n1) ){
//            System.out.println(m);
//        } else {
//            System.out.println(n);
//        }

        /*Задача 5:
        Задать размер ипотечного кредита , процентную ставку , кол-во лет .
        Найти переплату по кредиту, значение переплаты вывести в консоль.*/
//        double i = 6_000_000;  // ipoteka
//        double p = 5;           // procent
//        double y = 10;    // howLongIsNoLife
//        double v = i / y;  // payInYear

        /* Примитивный вариант */
//        double totalProcent = p * y;
//        System.out.println(totalProcent);
//        double overPayment = i * totalProcent;
//        System.out.println(overPayment);

        /* Рабочий вариант */    /* из формулы  summ = (p * i) + (p * (i - i/y)) + (p * (i - 2 * (i/y)) / 100        .....*/

//        double summOverPayment = (p * i *(( y - 1/y - 2/y - 3/y - 4/y - 5/y - 6/y - 7/y - 8/y - 9/y - 10/y
//                - 11/y - 12/y - 13/y - 14/y - 15/y - 16/y - 17/y - 18/y - 19/y)) * (-1)) / 100;
//        System.out.println(summOverPayment);

        /* Прочие варианты */
//        for ( y = 20 ; y >= 0 ; y--){
//            double oP = (i * p) / 100;
//            double iRemain = i - v;
//            double iiRR = iRemain + iRemain;
//            System.out.println(oP);
//            System.out.println(iRemain);
//            System.out.println(iiRR);
//        }
//
//        double v = i / y;  // payInYear
//        double oP1 = (i * p) / 100;       // overPayment in first year
//        double iRemain1 = i - v;  // остаток ипотеки после первого года
//        double oP2 = (iRemain1 * p) / 100;
//        double iRemain2 = iRemain1 - v;
//        double oP3 = (iRemain2 * p) / 100;
//        double iRemain3 = iRemain2 - v;
//        double oP4 = (iRemain3 * p) / 100;
//        double iRemain4 = iRemain3 - v;
//        double oP5 = (iRemain4 * p) / 100;
//        double iRemain5 = iRemain4 - v;
//        double oP6 = (iRemain5 * p) / 100;
//        double iRemain6 = iRemain5 - v;
//        double oP7 = (iRemain6 * p) / 100;
//        double iRemain7 = iRemain6 - v;
//        double oP8 = (iRemain7 * p) / 100;
//        double iRemain8 = iRemain7 - v;
//        double oP9 = (iRemain8 * p) / 100;
//        double iRemain9 = iRemain8 - v;
//        double oP10 = (iRemain9 * p) / 100;
//        double iRemain10 = iRemain9 - v;
//        double summ = oP1+oP2+oP3+oP4+oP5+oP6+oP7+oP8+oP9+oP10;
//        System.out.println(summ);

        /*Задача 6:
         В три переменные a, b и c записаны три вещественных числа.
         Создать программу, которая будет находить и выводить на экран
          вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.*/

//        double a = 1.25;
//        double b = 2.2;
//        double c = 3.15;
//        double x, x1, x2;
//        double d = b * b - 4 * a * c;   // дискриминант
//        System.out.println(d);
//
//        if ( d < 0){
//            System.out.println("Корней нет!");
//        }else if ( d == 0){
//            x = (b * -1) / (2 * a);
//            System.out.println(x);
//        }else if ( d > 0){
//            x1 = ((b * -1) + Math.sqrt(d)) / 2 * a;
//            x2 = ((b * -1) - Math.sqrt(d)) / 2 * a;
//            System.out.println(x1);
//            System.out.println(x2);
//        }

        /*Задача 7:
        Создать программу, выводящую в консоль наибольшую цифру любого трехзначного натурального числа. Примеры работы программы:
        В числе 208 наибольшая цифра 8
        В числе 774 наибольшая цифра 7
        В числе 613 наибольшая цифра 6
        */

//        int a = 978;
//        int b, c, d;
//
//        b = a / 100;
//        c = (a - b * 100 ) / 10;
//        d = ((a - b * 100) - c * 10 );
//
//        if ( b > c ) {
//            if ( b > d){
//                System.out.println("В числе " + a + " наибольшее число " + b);
//            }else   {
//                System.out.println("В числе " + a + " наибольшее число " + d);
//            }
//        } else if ( c > d ){
//            System.out.println("В числе " + a + " наибольшее число " + c);
//        }else   {
//            System.out.println("В числе " + a + " наибольшее число " + d);
//        }

    }
}
