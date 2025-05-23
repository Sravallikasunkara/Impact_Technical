import java.util.*;
public class substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int res=(int)Math.pow(2, n)-1;
        System.out.println(res);
        
    }

}
