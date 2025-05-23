import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1=new String(arr1);
        String s2=new String(arr2);

        if(s1.equals(s2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
    
}
