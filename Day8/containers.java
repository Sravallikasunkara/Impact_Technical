package Day8;

import java.util.*;

public class containers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int i=0;
        int j=n-1;
        while(i<j){
            System.out.println(arr[j]+" "+arr[i]);
            i++;
            j--;
        }

        if(n%2!=0){
            System.out.println(arr[i]+" "+"0");
        }
        
    }
}
