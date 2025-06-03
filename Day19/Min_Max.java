import java.util.*;
public class Min_Max {
    public static void main(String[] args) {
        System.out.println(Min(67));
        System.out.println(Max(67));
        
    }

    public static int Max(int num){
         int max=Integer.MIN_VALUE;
        while(num!=0){
            int rem=num%10;
            if(rem > max){
                max=rem;
            }
            num=num/10;
        }

        return max;

    }

    public static int Min(int num){
        int min=Integer.MAX_VALUE;
        while(num!=0){
            int rem=num%10;
            if(rem < min){
                min=rem;
            }
            num=num/10;
        }

        return min;
    }
    
}
