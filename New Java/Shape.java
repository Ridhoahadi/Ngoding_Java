import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape{
    public int area2;
    public Square(int x)
    {
        width = x;
    }
    public void area()
    {
        area2=width*width;
        System.out.println(area2);
    }
}

class Circle extends Shape{
    public double area1;
    public Circle(int y)
    {
        width = y;
    }
    public void area()
    {
        area1=Math.PI*width*width;
        System.out.println(area1);
    }
}