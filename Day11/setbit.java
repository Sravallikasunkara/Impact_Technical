package Day11;
import java.util.*;
public class setbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        // int res=n&(1<<i);
        int j=0;
        boolean result=true;
       while(n!=0 && j<=i){
        int rem=n%10;
        if(j==i && rem==1){
            result=true;
        }else{
            result=false;
        }
        j++;
        n/=10;
       }

       if(result==true){
        System.out.println("Yes");
       }else{
        System.out.println("No");
       }
        // if(res!=0){
        //     System.out.println("It is a set bit");
        // }else{
        //     System.out.println("It is not a set bit");
        // }
    }
}

// (1&(n>>i))