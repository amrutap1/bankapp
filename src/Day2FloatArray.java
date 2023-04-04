import java.util.Scanner;
public class Day2FloatArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Float Arr[] = new Float[5];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < 10; i++) {
            Arr[i] = sc.nextFloat();
        }
        float temp=0;
        for (int j=0;j<Arr.length;j++){
            if(Arr[j]>temp){
                temp=Arr[j];
            }
        }
        System.out.println("Greatest Number :" +temp);

    }
}
