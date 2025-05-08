import java.util.*;
import java.lang.*;

public class Adam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int square=n*n;
       int rev=0;

       while (n!=0) {
        int r=n%10;
        rev=rev*10+r;
        n=n/10;
       }

       int sq_rev=rev*rev;
       int rev_s_rev=0;

       while(sq_rev!=0){
        int rem=sq_rev%10;
        rev_s_rev=rev_s_rev*10+rem;
        sq_rev=sq_rev/10;
       }

       if(square==rev_s_rev){
        System.out.println("Adam Number");
       }else{
        System.out.println("Not an Adam Number");
       }


    }
    
}
