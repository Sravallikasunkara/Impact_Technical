import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter Row Number: ");
        // int row=sc.nextInt();
        // System.out.println("Enter Columnn Number: ");
        // int col=sc.nextInt();
        // System.out.println("Enter Seat Number: ");
        // int seat_no=sc.nextInt();

        // if(seat_no<=col){
        //     System.out.println("CSE");
        // }else if(seat_no%col==0 || seat_no%col==1){
        //     System.out.println("CSE");
        // }else{
        //     System.out.println("ECE");
        // }

       int n=sc.nextInt();

       int last=n%10;
       int first=n/1000;
       System.out.println(first+last);
 

    }
}