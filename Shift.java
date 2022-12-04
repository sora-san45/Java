import java.util.Scanner;
public class Shift {
    static void shift(int[] arr,String c,int n){
        int temp;
        if(c=="left"){
            for(int i=0;i<n;i++){
                for(int j=0;j<arr.length-1;j++){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        if(c=="right"){
            for(int i=0;i<n;i++){
                for(int j=arr.length-1;j>0;j--){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args){

        //creation of the array
        Scanner num = new Scanner(System.in);
        System.out.println("Enter limit");
        int n = num.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements :");
        for(int i =0;i<n;i++){
            Scanner num1 = new Scanner(System.in);
            arr[i] = num1.nextInt();
        }

        Scanner character = new Scanner(System.in);
        System.out.println("Enter which sort of shift");
        String c = character.nextLine();

        Scanner shift = new Scanner(System.in);
        System.out.println("Enter number of times: ");
        int s = shift.nextInt();

        shift(arr,c,s);
           
    }
}
