import java.util.Scanner;

public class Reverse_traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         for (int i = 1; i <= n; i++) {
            int spaces=(i-1);
            for(int k=1;k<=spaces;k++){
                System.out.print("  ");
            }
            for (int j = n; j >=i; j--) {      
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
