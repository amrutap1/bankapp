package Car;

public abstract class Vehicles {
    String color;
    abstract void details();
    void setColor(String clr){
        this.color=clr;
        System.out.println("color is: "+this.color);
    }

}
