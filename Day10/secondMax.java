package Day10;
import java.util.*;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int slargest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.println(slargest);
    }
    
}
