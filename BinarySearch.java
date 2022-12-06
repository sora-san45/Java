import java.util.*;
public class BinarySearch{

    public static int search(int[] arr, int ele){

        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if (arr[mid]>ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
    public static void main(String args[]){

        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to be searched: ");
        int ele = sc.nextInt();
        Arrays.sort(arr);

        int pos=search(arr,ele);

        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+pos);
        }

    }
}
