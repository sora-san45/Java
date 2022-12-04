import java.util.Scanner;
public class Fibonacci {

    static void fibo(int n){
        int a=0,b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter limit");
        int n = num.nextInt();
        fibo(n);
    }
    
}
