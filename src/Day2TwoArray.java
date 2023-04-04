import java.util.Scanner;

public class Day2TwoArray {
        public static void main(String[] args) {

                int a, b, i, j;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number of rows: ");
                a = sc.nextInt();
                System.out.print("Enter the number of columns: ");
                b = sc.nextInt();

                int array[][] = new int[a][b];
                System.out.println("Enter the elements of the array: ");

                for (i = 0; i < a; i++)
                    for (j = 0; j < b; j++)
                        array[i][j] = sc.nextInt();

                System.out.println("Elements of the array are: ");
                for (i = 0; i < a; i++)
                {
                    for (j = 0; j < b; j++)
                        System.out.print(array[i][j] + " ");

                    System.out.println();
                }
            }
        }

