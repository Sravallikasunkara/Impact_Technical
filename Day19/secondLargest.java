import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println(secondMax(arr));


    }

    public static int secondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int s_largest=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                s_largest=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i] > s_largest){
                s_largest=arr[i];
            }
        }

        return s_largest;
    }
    
}
