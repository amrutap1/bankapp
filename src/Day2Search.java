import java.util.Scanner;

public class Day2Search {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enetr Elements:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element: ");
        int search=sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==search){
                System.out.println("Elements is present ");
            }
        }


    }
}
