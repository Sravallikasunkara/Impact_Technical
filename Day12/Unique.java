package Day12;
import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        System.out.println(ans);
    } 
}
