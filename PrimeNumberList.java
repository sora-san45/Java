import java.util.Scanner;
public class PrimeNumberList{

    static void prime(int n){
        if (n==2){
            System.out.println(2);
        }
        else if (n>2){
            for(int i =2; i<n ;i++){
                int flag =0;
                for(int j=2;j<i;j++){
                    if (i%j==0){
                        flag =1;
                        break;
                    }
                }
                if (flag==0){
                    System.out.print(i+" ");
                }

            }
        }
    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter limit");
        int n = num.nextInt();
        prime(n);
    }
}
