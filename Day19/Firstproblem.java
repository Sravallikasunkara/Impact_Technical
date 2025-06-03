// write a code if

import java.util.*;

public class Firstproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean res=adam(12);
        if(res==true){
            System.out.println("Adam Number");
        }else{
            System.out.println("Not an Adam Number");
        }
        
    }

    public static boolean adam(int n){
        int square=n*n;
        int rev_n=reverse(n);
        int rev_square=rev_n*rev_n;
        int rev_rev_square=reverse(rev_square);

        if(square==rev_rev_square){
            return true;
        }

        return false;
    }

    public static int reverse(int a){
        int rev=0;
        while(a!=0){
            int temp=a%10;
            rev=rev*10+temp;
            a=a/10;
        }

        return rev;
    }
    
}
