package Day18;
import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


    }

    public static void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergesort(arr, left, mid);
            mergesort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i]=arr[left+i];
        }

        for (int i = 0; i < n2; i++) {
            R[i]=arr[mid+1+i];
        }

        int i=0,j=0;
        int k=left;

       
    }
}
