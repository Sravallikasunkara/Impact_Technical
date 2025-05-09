import java.util.Scanner;

public class CompatibleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        boolean flag=true;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }

        int b=sc.nextInt();
        int[] arr2=new int[b];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]>=arr2[i]){
                flag=true;
            }else{
                flag=false;
            }
        }

        if(flag==true){
            System.out.println("Compatible");
        }else{
            System.out.println("Not Compatible");
        }
    }
}
