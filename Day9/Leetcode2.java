package Day9;
import java.util.*;
public class Leetcode2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int rev1=0;
        int arr_sum=0;
        for (int i = arr1.length-1; i >= 0; i--) {
            int a=arr1[i];
            rev1=rev1*10+a;
        }
        int rev2=0;
        for (int i = arr2.length-1; i >= 0; i--) {
            int b=arr2[i];
            rev2=rev2*10+b;
        }

        arr_sum=rev1+rev2;

        int original=arr_sum;

        int count=0;
        while(arr_sum!=0){
            int rem=arr_sum%10;
            count++;
            arr_sum/=10;
        }

        int res_arr[]=new int[count];
        int i=0;
        while(original!=0){
            int temp=original%10;
            res_arr[i]=temp;
            i++;
            original/=10;
        }
        System.out.println(Arrays.toString(res_arr));  
    }
}
