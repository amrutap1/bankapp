public class Day3Rect
{
    int length;
    int breadth;
    Day3Rect(int l,int b){
        length=l;
        breadth=b;
    }
    void area(){
        int a=length*breadth;
        System.out.println("Area: "+a);
    }
    void parameter(){
        int p =2 *(length+breadth);
        System.out.println("parameter: "+p);
    }
    public static void main(String args[]){
        Day3Rect r1=new Day3Rect(6,4);
        r1.area();
        r1.parameter();

        Day3Rect r2=new Day3Rect(4,2);
        r2.area();
        r2.parameter();
    }
}
