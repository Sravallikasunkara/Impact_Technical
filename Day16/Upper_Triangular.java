package Day16;
import java.util.*;
public class Upper_Triangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        boolean res=false;
        int[][] arr=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i][j] == 0){
                    res=true;
                }else{
                    res=false;
                }

                // if(i==j && i>0){
                //     if(arr[i][j-1] == 0){
                //         res=true;
                //     }else{
                //         res=false;
                //     }
                // }
            }
        }

        if(res==true){
            System.out.println("Upper traingular matrix");
        }else{
            System.out.println("Not an upper Traingular matrix");
        }
    }
    
}
