
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort012(int[] arr)
    {   int start =0;
        int last = arr.length-1;
        int i=0;
        while (i<=last){
            if (arr[i]==0 ){
                swap(arr,i,start);
                if (i==start){
                    i++;
                }
                start=start+1;
            }
            if (i>last){
                break;
            }
            if (arr[i] == 2 ){
                swap(arr,i,last);
                if (i == last){
                    i++;
                }
                last=last-1;
            }
            if (arr[i]==1){
                i++;
            }
        }
    }
    public static void swap(int[] arr ,int start ,int last){
        int temp = arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
