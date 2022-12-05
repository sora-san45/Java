import java.util.*;

public class Garbage{
    public static void main(String[] args){
        Runtime r =Runtime.getRuntime();
        System.out.println("Memory before creating array"+r.freeMemory());
        int[] arr= new int[1000000];
        System.out.println("After array creation"+r.freeMemory());
        arr=null;
        r.gc();
        System.out.println("After calling gc"+r.freeMemory());

    }  
}