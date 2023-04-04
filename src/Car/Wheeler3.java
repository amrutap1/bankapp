package Car;

public class Wheeler3 extends Vehicles {
    String type1;


    Wheeler3 (String type1){
        this.type1=type1;

    }
    void details(){
        System.out.println("Model : "+this.type1);

    }
}
