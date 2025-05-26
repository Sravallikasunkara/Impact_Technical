package Day16;
import java.util.*;
public class Removal_of_characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        String res="";
        for(int i=0;i<s1.length();i++){
            if(!s.contains(String.valueOf(s1.charAt(i)))){
                res+=String.valueOf(s1.charAt(i));
                // char ch=s.charAt(i);
                // s1=s1.replace(String.valueOf(ch),"");
            }
        }
        System.out.println(res);
    }
}
