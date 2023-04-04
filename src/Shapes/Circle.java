package Shapes;

public class Circle extends Shape {
    int radius;
    Circle(int r){
        this.radius=r;
    }
    float calculateArea(){
        return (float) (3.14*this.radius*this.radius);
    }
}
