import java.util.Scanner;


public class Transpose {

    static void transpose(int[][] arr){
        for(int j=0;j<3;j++){
            for(int i =0;i<3;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        int[][] arr = new int[3][3];
        System.out.println("Enter elements into array");
        for(int i=0;i<3;i++){
            for(int j =0; j<3; j++){
                Scanner num = new Scanner(System.in);
                arr[i][j] = num.nextInt();
            }
        }

        transpose(arr);
    }
    
}
