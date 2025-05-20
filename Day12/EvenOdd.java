package Day12;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=n&1;
        if(res==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    
}
