public class Day3Triangle {

    int side1;
    int side2;
    int side3;

    Day3Triangle(int x1, int x2){
        side2=x1;
        side1=x2;
    }
    Day3Triangle(int x1,int x2,int x3){
        side1=x1;
        side2=x2;
        side3=x3;

    }
    void area(){
        int a=(side1*side2)/2;
        System.out.println("Area: "+a);
    }
    void parameter(){
        int a=(side1*side2)/2;
        int b=2*(a/side2);
        int p=(side3+side1+b);
        System.out.println("Perimeter:"+p);

    }
    public static void main(String args[]){
        Day3Triangle t1=new Day3Triangle(2,5,1);
        Day3Triangle t2=new Day3Triangle(2,5);
        t1.area();
        t2.parameter();
    }
}
