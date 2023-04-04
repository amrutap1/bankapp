package Car;
public class AbstractData {
    public static void main(String[] args) {
        String type="2 Wheeler";
        Vehicles v1= new Wheeler2(type);
        v1.details();
        v1.setColor("White");

        String type1="3 Wheeler";
        Vehicles v2= new Wheeler3(type1);
        v2.details();
        v2.setColor("Black");

        String type2="4 Wheeler";
        Vehicles v3= new Wheeler4(type2);
        v3.details();
        v3.setColor("Red");
    }
}
