import java.util.*;

public class ProdMatrix {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Rows and columns for Matrix A");
        a=sc.nextInt();
        b=sc.nextInt();
        int[][] ma= new int[a][b];
        System.out.println("Enter matrix A");
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                ma[i][j]=sc.nextInt();
            }
        }

        System.out.println("Rows and columns for Matrix B");
        c=sc.nextInt();
        d=sc.nextInt();
        int[][] mb= new int[c][d];
        System.out.println("Enter matrix B");
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                mb[i][j]=sc.nextInt();
            }
        }

        int[][] mn = new int[a][d];

        if(b==c){
            for(int i=0;i<a;i++){
                for(int j =0;j<d;j++){
                    mn[i][j]=0;
                    for(int k=0;k<b;k++){
                        mn[i][j]+=ma[i][k]*mb[k][j];
                    }
                }
            }
            for(int i=0;i<a;i++){
                for(int j=0;j<d;j++){
                    System.out.print(mn[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Matrix multiplication not possible");
        }
    }
    
}
