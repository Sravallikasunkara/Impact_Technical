package Day17;
import java.util.*;
public class selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxindex=maxindex(arr, 0, last);
            swap(arr, last, maxindex);
        }
    }

    public static int maxindex(int[] arr,int first,int end){
        int max=first;
        for (int i = first; i <= end; i++) {
            if(arr[i] > arr[max]){
                max=i;
            }
            
        }
        return max;
    }

    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
