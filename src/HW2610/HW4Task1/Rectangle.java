package HW2610.HW4Task1;

public class Rectangle {
    private int x1, y1, x2, y2, x3, y3, x4, y4;    // переменные для прямоугольника, точки координат вершин

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
    public double Side12(){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public double Side23(){
        return Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    }
    public double Side34(){
        return Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
    }
    public double Side41(){
        return Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
    }

    public void getPerimetr(Rectangle rectangle){   // метод подсчитывающий периметр
        double rectanglePerimetr = Side12() + Side23() + Side34() + Side41();
        System.out.println("Периметр прямоугольника = " + rectanglePerimetr);
    }
    public void getArea(Rectangle rectangle){           // метод подсчитывающий площадь
        double rectangleArea = Side12() * Side23();
        System.out.println("Площадь прямоугольника = " + rectangleArea);
    }


}
