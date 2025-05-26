package Day16;
import java.util.*;
public class Zigzagsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        int sum=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               if(i==0 || i==r-1 || j == (r-i-1)){
                    sum+=arr[i][j];
               }
            }
        }

        System.out.println(sum);
    }
    
}
