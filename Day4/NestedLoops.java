import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // for (int i = 1; i <= n; i++) {
        //     int spaces=(n-i);
        //     for(int k=1;k<=spaces;k++){
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
    
}
