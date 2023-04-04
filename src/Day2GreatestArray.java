import java.util.Scanner;

public class Day2GreatestArray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int Arr[] = new int[10];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < 10; i++) {
            Arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            System.out.print(Arr[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        int temp=0;
        for (int j=0;j<Arr.length;j++){
            if(Arr[j]>temp){
                temp=Arr[j];
            }
        }
        System.out.println("Greatest Number :" +temp);


    }
}

