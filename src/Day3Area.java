 class Area {
    int length;
    int breadth;
    Area(int l,int b){
        length=l;
        breadth=b;
    }
 }
class Triangle extends Area{

    Triangle(int l, int b) {
        super(l, b);

    }
    void display(){
        int a=1/2*(length*breadth);
        System.out.println("Area of Triangle: "+a);
    }
}

class Rect extends Area{

    Rect(int l, int b) {
        super(l, b);
    }
    void display(){
        int a=length*breadth;
        System.out.println("Area of Rect: "+a);
    }
}

 class circle extends Area{
    int r;
     circle(int l, int b) {
         super(l, b);

     }
     void display(){
         float a= (float) (3.14*length*breadth);
         System.out.println("Area of circle: "+a);

     }
 }
public class Day3Area {
    public static void main(String args[]){
        Triangle t1=new Triangle(2,3);
        t1.display();
        Rect r1=new Rect(4,6);
        r1.display();
        circle c1=new circle(2,2);
        c1.display();

    }
}