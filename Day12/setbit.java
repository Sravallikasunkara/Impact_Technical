package Day12;

import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=sc.nextInt();
        int res=num|(1<<i);
        System.out.println(res);

    }
}
