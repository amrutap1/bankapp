public class Day2Reverse {
    public static void main(String args[]){
        int n= 454;
        int sum=0;

            while(n > 0)
            {
                int remainder = n % 10;             //remainder is 8          // 1267%10  = 7
                sum = (sum * 10) + remainder;         // 0*10+8 = 8               8*10+7 =87
                n = n/10;                           //12678/10                  1267/10
            }

        int r,sum1=0,temp;
        int num=454;//It is the number variable to be checked for palindrome

        temp=num;
        while(num>0){
            r=num%10;  //getting remainder
            sum1=(sum1*10)+r;
            num=num/10;
        }
        if(temp==sum1)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

}
