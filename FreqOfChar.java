import java.util.*;

public class FreqOfChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String st = sc.next();
        System.out.println("Enter character to find");
        char ch = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<st.length();i++){
            if(ch==st.charAt(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
