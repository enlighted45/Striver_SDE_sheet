
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>();
        //permutation.add(3);
        permutation.add(1);
        permutation.add(2);
       // permutation.add(4);
      // permutation.add(5);
        System.out.println(nextPermutation(permutation));

    }
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        // find
        int  inv = 0;
        if (permutation.size()>1) {
            for (int i = permutation.size() - 2; i >= 0; i--) {
                if (permutation.get(i) < permutation.get(i + 1)) {
                    inv = i;
                    break;
                }
            }
        }
        int next_big = nxtbg(permutation,inv);
        Collections.swap(permutation,next_big,inv);
        if (inv != 0 && next_big!=0) {
            int start = inv + 1;
            int last = permutation.size() - 1;
            while (start < last) {
                Collections.swap(permutation, start, last);
                start++;
                last--;
            }
        }
        if(inv == 0 && next_big==0) {
            int start = inv ;
            int last = permutation.size() - 1;
            while (start < last) {
                Collections.swap(permutation, start, last);
                start++;
                last--;
            }
        }
        return permutation;
    }
    public static int nxtbg(ArrayList<Integer> perm,int inv){
        int ans =100001;
        int index =0;
        if (perm.size()>1) {
            for (int i = inv + 1; i < perm.size(); i++) {
                if (perm.get(i) > perm.get(inv)) {
                    int temp = ans;
                    ans = Math.min(ans, perm.get(i));
                    if (ans != temp) {
                        index = i;
                    }
                }
            }
        }
        return index;
    }
}
