package Day8;
import java.util.*;
public class cognizant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n*2];
        int i=0;
        int max_height_person=0;
        int max_weight_person=0;
        for (int j = 0; j < arr.length; j++) {
            arr[j]=sc.nextInt();
        }
        int max_height=arr[0];
        int max_weight=arr[1];
        for (i = 2; i < arr.length; i++) {
            if(i%2==0){
                if(arr[i]>max_height){
                    max_height=arr[i];
                }
            }else if(i%2!=0){
                if(arr[i]>max_weight){
                    max_weight=arr[i];
                }
            }
        }
        System.out.println(max_height);
        System.out.println(max_weight);
        for (int j = 0; j < arr.length; j++) {
            if(j%2==0 && arr[j]==max_height){
                max_height_person=(j/2)+1;
                break;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(j%2!=0 && arr[j]==max_weight){
                max_weight_person=(j/2)+1;
                break;
            }  
        }
        System.out.println("Max Height person: "+max_height_person);
        System.out.println("Max Weight person: "+max_weight_person);
    }
}
