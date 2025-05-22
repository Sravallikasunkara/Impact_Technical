package Day14;
import java.util.*;
public class leetcode771 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String jewels=sc.nextLine();
        String stones=sc.nextLine();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            if(stones.contains(String.valueOf(jewels.charAt(i)))){
                count++;
                if(stones.indexOf(stones.charAt(i)) != -1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
