public class Day2Prime {
    public static void main(String args[]){

        for(int i=1;i<=50;i++){
            int f=0;
            for(int j=2;j<i;j++){
                if(i%j==0 ){
                    f=1;
                }
            }
            if (f==0){
                System.out.println(i+" ");

            }
        }
        System.out.println("");


        int num=10;
        int flag=0;

        for(int i=2;i<num;i++)
        {
            if(num%i==0 ){
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("prime number is="+ num);

        }
        else{

            System.out.println("It is not prime number");
        }
    }
}
