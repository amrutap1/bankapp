package Shapes;

public class AbstractDemo {
    public static void main(String args[]){
        int radius=2,side=4;
        Shape s=new Circle(radius);
        Shape s1= new Square(side);
        System.out.println("Area of circle: "+s.calculateArea());
        s.setColor("blue");
        System.out.println("Area of square: "+s1.calculateArea());
        s1.setColor("Green");
    }
}
