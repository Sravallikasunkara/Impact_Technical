import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        // for (int i = 1; i < n; i++) {
        //     if(arr[i-1]!=arr[i]){
        //         System.out.println(arr[i-1]);
        //     }
        // }

        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1] || i==n-1){
                System.out.println(arr[i]);
            }
        }
    }
}
