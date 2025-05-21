package Day13;
import java.util.*;
import java.lang.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        String s=original.toLowerCase();
        String temp=s;
        String res="";
        for (int i = s.length()-1; i >= 0; i--) {
            res=res+s.charAt(i);
        }
        if(res.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    
}
    