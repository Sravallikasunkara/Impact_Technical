package Day10;
import java.util.*;

public class Majorityele {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int count=0;
        int majority_e=0;
        for (int i = 1; i < arr.length; i++) {
            if(count==0){
                majority_e=arr[i];
            }else if(arr[i]==majority_e){
                count++;
            }else{
                count--;
            }
        }

       System.out.println(majority_e); 
        
    }
}
