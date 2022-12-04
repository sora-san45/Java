import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String st = sc.nextLine(); 
        int n=st.length();
        int flag=0;
        for(int i=0;i<=n/2;i++){
            if(st.charAt(i)!=st.charAt(n-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
