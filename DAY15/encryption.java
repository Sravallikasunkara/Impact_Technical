import java.util.*;

public class encryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<s.length()-1){
            res.append(s.charAt(i+1));
            res.append(s.charAt(i));
            i=i+2;
        }

        if(s.length()%2!=0){
            res.append(s.charAt(s.length()-1));
        }

        System.out.println(res);
    }
    
}
