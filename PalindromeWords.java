import java.io.*;
import java.util.*;

public class PalindromeWords {
    public static void main(String args[]){
        try{
            FileWriter f = new FileWriter("A.txt");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            StringTokenizer s = new StringTokenizer(line," ");
            String str="";
            while(s.hasMoreTokens()){
                String word=s.nextToken();
                int j=0;
                int flag=0;
                String st="";
                for(int i=word.length()-1;i>=0;i--){
                    st+=word.charAt(i);
                }
                System.out.println(st);
                if(word.equals(st)){
                    str+="*** ";
                }
                else{
                    str+=word+" ";
                }
            }
            f.write(str);
            f.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
