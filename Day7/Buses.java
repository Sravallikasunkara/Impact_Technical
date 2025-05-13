import java.util.Scanner;

public class Buses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        // int i=0;
        // while(i<n){
        //     if(arr[i]+arr[i+1]<=m && arr[i]<m){
        //         count++;
        //         i=i+1;
        //     }else if(arr[i]<=m){
        //         count++;
        //         i++;
        //     }
        // }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<m){
                count++;
            }
            else if(arr[i]+arr[i+1]<=m && arr[i]<m){
                count++;
            }
            
        }
       System.out.println("Count of Buses: "+count);
    }
}
