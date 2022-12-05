import java.util.*;

public class QuickSort{

    public static int partition(String a[],int low,int high){
        int start=low,end=high;
        String pivot=a[low];
        do {
            while (a[start].compareTo(pivot) <= 0 && start<high) {
                start++;
            }
            while (a[end].compareTo(pivot) > 0) {
                end--;
            }
            if (start < end) {
                String temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }while(start<end);
        String temp=a[low];
        a[low]=a[end];
        a[end]=temp;
        return end;
    }

    void quicksort(String a[],int low,int high){
        if(low<high){
            int pos=partition(a,low,high);
            quicksort(a,low,pos-1);
            quicksort(a,pos+1,high);
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        String[] a=new String[n];
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++){
            a[i]=sc.next();    
        }
        QuickSort o = new QuickSort();
        o.quicksort(a,0,n-1);
        System.out.print("The Sorted Names are :  ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
