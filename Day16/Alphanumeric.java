package Day16;
import java.util.*;
public class Alphanumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                res+=Character.getNumericValue(ch);
            }
        }
        System.out.println(res);
    }
    
}
