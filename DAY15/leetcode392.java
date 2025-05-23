import java.util.*;
public class leetcode392 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int i=0;
        int j=0;
        boolean res=false;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
    
            }
        }

        if(i==s.length()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
