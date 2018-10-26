package HW2610.HW4Task1;

public class Triangle {
    private int x1, y1, x2, y2, x3, y3;    // переменные для треугольника, точки координат вершин

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {  // конструктор треугольника
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double Side12(){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public double Side23(){
        return Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    }
    public double Side31(){
        return Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }

    public void getPerimetr(Triangle triangle){   // метод подсчитывающий периметр
        double trianglePerimetr = Side12() + Side23() + Side31();
        System.out.println("Периметр треугольника = " + trianglePerimetr);
    }
    public void getArea(Triangle triangle){         // метод подсчитывающий площадь
        double halfPerimetr = (Side12() + Side23() + Side31()) / 2;
        double triangleArea = Math.sqrt(halfPerimetr * (halfPerimetr - Side12()) * (halfPerimetr - Side23()) * (halfPerimetr - Side31()));
        System.out.println("Площадь треугольника = " + triangleArea);
    }
}