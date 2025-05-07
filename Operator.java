import java.util.*;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // int n=sc.nextInt();

        // int last=n%10;
        // int first=n/100;
        // int middle=(n-first*100)/10; // (n/10)%10
        // int rev=last*100+middle*10+first*1;
        // System.out.print(rev);

        int coins=sc.nextInt();
        int Ben=sc.nextInt();
        int Black=sc.nextInt();

        int Bens_share=coins * Ben/100;
        int Black_share=(coins-Bens_share)*Black/100;
        int Three_pirates= (coins-(Bens_share+Black_share))/3;

        System.out.println("Ben's Share:"+Bens_share);
        System.out.println("Black's Share:"+Black_share);
        System.out.println("Three pirates equal Share:"+Three_pirates);
        
        
    }
    
}
