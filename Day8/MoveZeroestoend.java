package Day8;
import java.util.*;
public class MoveZeroestoend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res=0;
        int Zero_count=0;
        String s="";
        for (int i = 0; i < arr.length; i++) {
            int m=arr[i];
            while(m!=0){
                int temp=m%10;
                if(temp==1){
                    res=res*10+1;
                }else{
                    Zero_count++;
                }
                m=m/10;
            }
            while(Zero_count!=0){
                s=s+"0";
                Zero_count--;
            }
            System.out.println(res+""+s);
            res=0;
            Zero_count=0;
            s="";
        }
    }
}
