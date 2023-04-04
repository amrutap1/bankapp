public class Day2SumofDigits {
    public static void main(String args[]){
        int n=183;
        int sum = 0;
        int d=0;
        while (n!=0) {
            d = n% 10;
            sum = sum + d;
            n=n/10;
        }
        System.out.println(sum);


    }
}
