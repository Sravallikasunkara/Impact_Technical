package Day8;

import java.util.*;

public class SmallestPositiveMissing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int result=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>0){
                if((arr[i]-arr[i-1])!=1){
                    result=arr[i-1]+1;
                }
            }
        }

        if(result==0){
            System.out.println(arr[n-1]+1);
        }else{
            System.out.println(result);
        }
    }
}
