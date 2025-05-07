import java.util.Scanner;

public class Odd_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i = 1; i <= n; i++) {
            int num=i;
            int digit_count=0;
            while(num!=0){
                int r=num%10;
                num=num/10;
                digit_count=digit_count+1;
            }
            if(digit_count%2!=0){
                count=count+1;
            }  
        }

        System.out.println(count);
    }
    
}
