import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,2};
        int[] res=new int[arr.length];
        int k=1;
        res[0]=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                res[k]=arr[i];
                k++;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(res));
        
    }

}
