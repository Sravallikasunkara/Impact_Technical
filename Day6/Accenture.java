import java.util.*;
import java.lang.*;
public class Accenture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            int x=1;
            int y=(int)Math.cbrt(a);
            while(x<y){
                int res=(int)Math.pow(x,3)+(int)Math.pow(y, 3);
                if(res<a){
                    x++;
                }else if(res==a){
                    count++;
                    break;
                }
            }  
        }
        System.out.println(count);
    }
}
