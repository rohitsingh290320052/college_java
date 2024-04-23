// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;




public class adjacnecy_matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of verteces : ");
        int n = sc.nextInt();

        while(n<0){
            System.out.println("Enter the valid vertex :");
            n = sc.nextInt();
        }

        int [][]arr = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.println("Enter 1 if there is a edge between "+i+" and "+j+"else,Enter 0");
                int edge = sc.nextInt();
                if(edge != 0 && edge != 1){
                    edge = sc.nextInt();
                }
                arr[i][j] = edge;
                arr[j][i] = edge;

            }
        }

        System.out.println("Printing 2d matrix : ");

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}