public class Day1Condition {

    static void Display(int x, int y, int z){
        if(x>y && x>z)
        {
            System.out.println(x +" is greater than "+ y +" , " +z);
        }
        else if (y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
    public static void main(String args[]){
        int a=40;
        int b=20;
        if(a>b){
            System.out.println(" A greater than b");

        }
       int month=9;
        String seasons;
        if (month==12 || month==1 || month==2){
            seasons="winter";
        }
        else if (month==3 || month==4 || month==5){
            seasons="spring";
        }
        else if (month==6 || month==7 || month==8) {
            seasons="Summer";
        }
        else if (month==9 || month==10 || month==11) {
            seasons="Autunm";
        }
        else {
            seasons="bonus month";
        }
        System.out.println("september is the "+seasons+ "," );


        String typeofTv ="LCD";
        int sizeofTv=32;
        int discount = 0;

        if ("LED".equals(typeofTv)){
            if(sizeofTv==32){
                discount=10;
            }
            else if(sizeofTv==46){
                discount=15;
            }
        }
        else if("LCD".equals(typeofTv)){
            discount=5;
        }
        System.out.println(discount);
        Display(23,45,12);


    }
}

