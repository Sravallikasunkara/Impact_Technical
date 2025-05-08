import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit_count=0;
        int original=n;
        int temp=n;
        int arm=0;
        while(temp!=0){
            int r=temp%10;
            digit_count+=1;
            temp/=10;
        }
        while(n!=0){
            int rem=n%10;
            arm+=((int)Math.pow(rem, digit_count));
            n=n/10;
        }
        System.out.println(arm);
        if(arm==original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
    
}
