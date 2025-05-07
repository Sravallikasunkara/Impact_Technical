import java.util.*;
public class Conditional {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // int n=sc.nextInt();

        // if(n%2!=0){
        //     System.out.println("Weird");
        // }else if(n%2==0 && n>=5 && n<=5){
        //     System.out.println("Not Weird");
        // }else if( n%2==0 && n>=6 && n<=20){
        //     System.out.println("weird");
        // }else if(n%2==0 && n>20){
        //     System.out.println("Not Weird");
        // }



        int month=sc.nextInt();
        int rent=sc.nextInt();
        int days=sc.nextInt();
        int hotel_tariff=0;

        if(month>=1 && month<=12){
            if(month==4 || month==5 || month==6 || month==11 || month==12){
                hotel_tariff=(rent+rent*20/100)*days;
            }else{
                hotel_tariff=rent*days;
            }
        }else{
            System.out.println("Invalid");
        }

        System.out.println("Total Hotel Tariff: "+hotel_tariff);




        /*TRENDY NUMBER */

        // int n=sc.nextInt();
        // int middle=(n/10)%10;

        // if ( n>99 && n<=999 && middle%3==0){
        //     System.out.println("Trendy Number");
        // }else{
        //     System.out.println("Not a Trendy Number");
        // }

        

        // int n=sc.nextInt();

        // if(n>9 && n<=99){
            
        // if(n<=20){
        //     System.out.println("Less than 20");
        // }else if(n>20 && n%2==0){
        //     System.out.println("Greater Than 20 and even");
        // }else if(n>20 && n%2!=0){
        //     System.out.println("Greater Than 20 and Odd");
        // }

        // }else{
        //     System.out.println("Invalid");
        // }



        
    }
}
