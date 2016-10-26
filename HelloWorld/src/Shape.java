/**
 * Created by 王晨宇1 on 2016/10/25.
 */
abstract public class Shape {
    abstract void area();
}
class Triangle extends Shape {
    int high;
    int bottom;
    void area() {
        int area = 1/2 * high * bottom;
        System.out.println("长方形的面积是"+area);
    }
}
class Square extends Shape{
    int length;
    void area(){
        int area = length * length;
        System.out.println("正方形的面积是"+area);
    }
}
class Roundness extends Shape{
    int r;
    double p = 3.14;
    void area(){
        double area = p * r * r;
        System.out.println("圆形的面积是"+area);
    }
}

class Test{
    public static void main(String args[]){
        Shape rectangle = new Triangle();
        rectangle.area();
        Shape square = new Square();
        square.area();
        Shape roundness = new Roundness();
        roundness.area();
    }
}
