import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(num!=0){
            int r=num%10;
            sum+=r;
            num=num/10;

            if(sum<=9){
                sum=sum;
            }else{
                num=sum;
                sum=0;
            }
        }
        System.out.println(sum);

        if(sum<=9){
            System.out.println(sum);
        }else{
            int s_sum=0;
            while (sum!=0) {
                int r=sum%10;
                s_sum+=r;
                sum=sum/10;
            }
            System.out.println(s_sum);
        }
    }
    
}
