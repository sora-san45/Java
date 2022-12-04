import java.util.Scanner;
public class LinearSearch{

    static void search(int[] arr, int n,int a){
        int flag=0;
        int j;
        for( j =0; j<n; j++){
            if (arr[j]==a){
                flag=1;
                break;
            }
        }
        if( flag ==0 ){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index "+j);
        }
    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter limit :");
        int n = num.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers into array");
        for(int i =0;i<n;i++){
            Scanner number = new Scanner(System.in);
            arr[i] = number.nextInt();
        }
        Scanner no = new Scanner(System.in);
        System.out.println("Enter number to be searched :");
        int num1 = no.nextInt();
        search(arr,n,num1);

    }
}
