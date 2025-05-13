import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] nums1=new int[m];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] nums2=new int[n];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=sc.nextInt();
        }
        int[] res=new int[m+n];
        int k=0;
        int i=0;
        int j=0;
        double median;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                res[k]=nums1[i];
                i++;
                k++;
            }else{
                res[k]=nums2[j];
                j++;
                k++;
            }
        }

        while(i!=m){
            res[k]=nums1[i];
            i++;
            k++;
        }

        while(j!=n){
            res[k]=nums2[j];
            j++;
            k++;
        }

        // System.out.println(Arrays.toString(res));
        
        if(res.length%2!=0){
            int mid=res.length/2;
            median=res[mid];
        }else{
            int mid=res.length/2;
            median=(res[mid]+res[mid-1])/2;
        }
        System.out.println("Median: "+median);

        
    }
}
