
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(printPascal(5));

    }
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        for (int i = 1; i <n+1 ; i++) {
            ArrayList<Long> ans2 = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j==0 || j==i-1){
                    ans2.add(1L);
                }
                else{
                    long ele = ans.get(i-2).get(j-1)+ans.get(i-2).get(j);
                    ans2.add(ele);
                }
            }
            ans.add((ArrayList<Long>) ans2.clone());
        }
        return ans;

    }
}
