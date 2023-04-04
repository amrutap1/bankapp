package Car;

public class Wheeler2 extends Vehicles{
    String type;


    Wheeler2 (String type){
            this.type=type;

    }
    void details(){
        System.out.println("Model : "+this.type);

    }
}
