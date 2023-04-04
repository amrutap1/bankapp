public class Day2Loops {
    public static void main(String args[]){
        int x=1;
        while (x<=20){
            System.out.println(x);
            x++;
        }
        System.out.println(" Even numbers");
        int a=20;
        int b=2;

        do {
            System.out.print(b+" ");
            b=b+2;
        }while (b<=a);
        System.out.println("Odd Numbers ");
        for(int i=1;i<=20;i++){
            if(i%2!=0){

                System.out.print(i+" ");
                i++;
            }
        }
    }
}
