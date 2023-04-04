public class Day2Factorial {
    public static void main( String args[]){
        int n=3;
        int fact=1;
        int i;
        /*1
         1*2
         1*2*3
         1*2*3*4
         1*2*3*4*5
         */
        for(i=n;i>=1;i--){
            fact=fact*i;

        }
        System.out.println("Factorial "+n+" = "+fact);

        int j=5;
        int f=1;
        while (j>=1){

            f=f*j;
            j--;
        }
        System.out.println("factorial of 5: "+f);
    }
}
