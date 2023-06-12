
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ans = {10,20,-30,40,-50};
        System.out.println(maxSubarraySum(ans,ans.length));

    }
    public static long maxSubarraySum(int[] arr, int n) {
        long ans =0;
        long sum=0;
        for (int i = 0; i < n; i++) {
            if(i==0 || sum>=0){
                sum = sum+arr[i];
                ans = Math.max(sum,ans);
            }
            else{
                sum=0L;
                sum = sum+arr[i];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }
}
