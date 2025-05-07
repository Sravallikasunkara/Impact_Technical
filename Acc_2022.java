import java.util.*;
public class Acc_2022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int m=sc.nextInt();

        int first=m*(num/m);
        int last=first+m;

        if((num-first)<(last-num)){
            System.out.println(first);
        }else{
            System.out.println(last);
        }

    }
    
}
