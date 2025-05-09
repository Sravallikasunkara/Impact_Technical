import java.util.Scanner;

public class SameArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum1=0;
        int a=sc.nextInt();
        int[] arr1=new int[a];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
            sum1+=arr1[i];
        }

        int b=sc.nextInt();
        int[] arr2=new int[b];
        int sum2=0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
            sum2+=arr2[i];

        }

        if(a==b && sum1==sum2){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }
        
    }
}
