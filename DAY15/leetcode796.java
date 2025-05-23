import java.util.*;
public class leetcode796 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=0;
        int end=s.length()-1;
        boolean res=true;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                if(reverse(s, start+1, end) || reverse(s, start, end-1)){
                    res=true;
                }
            }
                start++;
                end--;
        }
       System.out.println(res); 

    }

    static boolean reverse(String s,int start,int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
