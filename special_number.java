import java.util.*;
public class special_number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Special Numbers: ");
        for (int i = a; i <= b; i++) {
            int first=i/10;
            int last=i%10;
            int sum=first+last;
            int product=first*last;
            if((sum+product)==i){
                System.out.println(i);
            } 
        }   
    }

}