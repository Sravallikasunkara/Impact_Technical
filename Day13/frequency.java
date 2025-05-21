package Day13;
import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char targert=sc.next().charAt(0);
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == targert){
                count++;
            }
        }
        System.out.println(count);
    }
}
