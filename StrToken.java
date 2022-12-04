import java.util.*;

public class StrToken {
    public static void main(String args[]){
        System.out.println("Enter integers :");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringTokenizer st1 = new StringTokenizer(st," ");
        int sum=0;
        while(st1.hasMoreTokens()){
            int num=Integer.parseInt(st1.nextToken());
            sum+=num;
            System.out.print(num+"+");
        }
        System.out.print("="+sum);
    }
    
}
