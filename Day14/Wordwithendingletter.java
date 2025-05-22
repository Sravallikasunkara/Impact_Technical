package Day14;
import java.util.*;

import Day13.string;
public class Wordwithendingletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n+1];
        for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextLine();
        }
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length-1; i++) {
            String s=arr[i];
            String next=arr[i+1];
            char ch1=s.charAt(s.length()-1);
            char ch2=next.charAt(0);
            if(ch1==ch2){
                // System.out.println(arr[i]);
                System.out.println(arr[i+1]);
            }
        }
    }
}
