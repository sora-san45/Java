import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileWR {

    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            FileWriter fw= new FileWriter("file1.txt");
            while(true){
                System.out.println("Enter line");
                String s= sc.next();
                fw.write(s);
                fw.write("\n");
                System.out.println("Want more lines");
                char ch1=sc.next().charAt(0);
                if(ch1=='n'){
                    break;
                }
            }
            fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        try{
            FileReader fr= new FileReader("file1.txt");
            int ch=fr.read();
            while(ch!=-1){
                System.out.println((char)ch);
                ch=fr.read();
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
    
}