import java.util.*;
public class Loops {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int s_largest=0;
        int min=0;
        int max=0;
        int hcf=1;
        
        if(a>b && a>c){
            max=a;
        }else if(b>a && b>c){
            max=b;
        }else{
            max=c;
        }
        
        if(a<b && a<c){
            min=a;
        }else if(b<a && b<c){
            min=b;
        }else{
            min=c;
        }
        
        if((a>(min) && a<(max))){
            s_largest=a;
        }else if((b>(min) && b<(max))){
            s_largest=b;
        }else{
            s_largest=c;
        }
        
        for(int i=1;i<=min;i++){
            if (a%i==0 && b%i==0 && c%i==0){
                hcf=i;
            }
        }
        
        
        System.out.println("The code to open the box is: "+hcf);
        System.out.println("Treasure is present in this box:"+s_largest);
        
        
        


        // int count=0;
        // int n=sc.nextInt();

        // while(n>1) {
        //     if(n%2==0){
        //         System.out.println(n);
        //         n=n/2;
        //         count++;
        //     }else{
        //         System.out.println(n);
        //         n=3*n+1;
        //         count++;
        //     }
        // }

        // System.out.println("Count:"+count);
       
    }
    
}
