import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr=new int[n];
       for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
       }
        int loc=sc.nextInt();
        int ele=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(i==(loc-1)){
                System.out.print(ele+" ");
            }
            System.out.print(arr[i]+" ");
            
        }
        
        
        // int[] res=new int[n+1];
        // for (int i = 0; i < res.length; i++) {
        //     if(i<(loc-1)){
        //         res[i]=arr[i];
        //     }else if(i==(loc-1)){
        //         res[i]=ele;
        //     }else if(i>(loc-1)){
        //         res[i]=arr[i-1];
        //     }
        // }

        // System.out.println(Arrays.toString(res));
    }
}
