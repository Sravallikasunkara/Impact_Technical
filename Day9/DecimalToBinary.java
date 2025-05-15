package Day9;

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[32];
        int i=0;
        int rev=0;
        int place=1;
        while(n>0){
            int rem=n%2;
            rev=(rev+rem)*place;
            place=place*10;
            // arr[i]=rem;
            // i++;
            // n=n/2;
        }
        System.out.println(rev);
        System.out.println(place);
        // for (int j = i-1; j >= 0 ; j--) {
        //     System.out.print(arr[j]);
        // }
    }
}
