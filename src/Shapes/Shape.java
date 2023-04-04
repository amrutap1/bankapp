package Shapes;

public abstract class Shape {
    String color;
    abstract float calculateArea();
    void setColor(String clr){
        this.color=clr;
        System.out.println("color is:"+this.color);
    }

}
