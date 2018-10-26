package HW2610.HW4Task1;

public class Circle {
    private int x1, y1, x2, y2;    // переменные для круга, точки координат центра окружности и точки на окружности(радиус)

    public Circle(int x1, int y1, int x2, int y2) {   // конструктор для круга
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double Radius(){  // подсчитываем радиус
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public void getArea(Circle circle){    // создали метод подсчитывающий площадь круга
        double circleArea = Math.sqrt(Radius())*Math.PI;
        System.out.println("Площадь круга = " + circleArea);

    }public void getPerimetr(Circle circle){    // создали метод подсчитывающий периметр круга
        double circlePerimetr = Math.pow(Radius(), 2)*Math.PI;
        System.out.println("Периметр круга = " + circlePerimetr);
    }
}
