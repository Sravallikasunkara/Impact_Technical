import java.util.Scanner;

public class strongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int fact=1;
        while(n!=0){
            int r=n%10;
            for (int i = 1; i<=r; i++) {
                fact=fact*i;
            }
            sum+=fact;
            fact=1;
            n=n/10;
        }
        
        if(sum==temp){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
    
}
