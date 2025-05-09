import java.util.Scanner;

public class Count_distinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }

        System.out.println("Count of distinct elements: "+count);
    }
}
