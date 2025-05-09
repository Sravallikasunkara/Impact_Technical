import java.util.*;
public class sort {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,8};
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr[i],arr[j]);
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
