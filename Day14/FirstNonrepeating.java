package Day14;
import java.util.*;
public class FirstNonrepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }
        
        
    }
}
