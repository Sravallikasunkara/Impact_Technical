import java.util.Scanner;

public class Even_Odd_sum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        while(num!=0){
            int r=num%10;
            if(r%2==0){
                even_sum=even_sum+r;
            }else{
                odd_sum=odd_sum+r;
            }
            num=num/10;
        }
        System.out.println("Even sum: "+even_sum);
        System.out.println("Odd Sum: "+odd_sum);
    }
    
}
