package Shapes;

public class Square extends Shape {
    int side;
    Square (int s){

        this.side=s;
    }
    float calculateArea(){
        return (this.side*this.side);
    }
}
