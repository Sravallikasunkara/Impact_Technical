package Day10;
import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int i=0;
        while(n!=0){
            int rem=n%10;
            res=res+rem*(int)Math.pow(2, i);
            i++;
            n=n/10;
        }
        System.out.println(res);
    }
}
