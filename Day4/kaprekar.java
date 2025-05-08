import java.util.Scanner;
public class kaprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        int square=n*n;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int denominator=(int)Math.pow(10,count);
        int right=square%denominator;
        int left=square/denominator;
        int sum=right+left;
        if(sum==n){
            System.out.println("kaprekar");
        }else{
            System.out.println("Not a kaprekar");
        }
    }
    
}
