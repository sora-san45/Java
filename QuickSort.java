import java.util.*;

public class QuickSort {

    public static int partition(int arr[],int low,int high){
        int start=low,end=high;
        int pivot=arr[low];
        while(start<=end){
            while(arr[start]<=pivot){
                start++;
            } 
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[end];
        arr[end]=temp;
        return end;
    }

    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pos=partition(arr,low,high);
            quicksort(arr,low,pos-1);
            quicksort(arr,pos+1,high);
        }
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array length");
        int n=sc.nextInt();

        
        
    }
}
