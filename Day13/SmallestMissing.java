package Day13;
import java.util.*;
import java.lang.*;
public class SmallestMissing {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alphabet.length();i++){
            char ch=alphabet.charAt(i);
            if(s.indexOf(ch) == -1){
                System.out.println(ch);
                break;
            }
        }
    }
    
}
