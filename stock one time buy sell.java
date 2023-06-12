
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int maximumProfit(ArrayList<Integer> prices){
        int profit=0;
        int min = prices.get(0);
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i)-min>0){
                profit=Math.max(profit,prices.get(i)-min);
            }
            min = Math.min(min,prices.get(i));
        }
        return profit;

    }
    public static void swap(int[] arr ,int start ,int last){
        int temp = arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
