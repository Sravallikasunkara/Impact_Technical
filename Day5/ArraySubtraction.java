public class ArraySubtraction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            res-=arr[i];
        }
        System.out.println("Result: "+res);
    }
}
