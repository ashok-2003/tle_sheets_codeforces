import java.util.ArrayList;
import java.util.List;

public class rough_1 {
//    https://leetcode.com/problems/perfect-squares/description/
    // this problem here
    public static void main(String[] args) {
        System.out.println(numSquares(271));
        System.out.println(count);
        // so that why this problem is giving the tle exceed on it

    }
    static int ans = 100000000;
    static int count = 0;
    public static int numSquares(int n) {
        if(n == 1){
            return 1;
        }
        // so now here we have to get the perfect square here so now we can get this in the form of the helper here
        List<Integer> list = new ArrayList<>();
        // and here
        int index = n/2;
        helper(n , list , index);
        return ans;
    }
    static void helper(int target , List<Integer> ls , int index){
        // so now here
        count++;
        if(target == 0){
            ans = Math.min(ls.size() , ans);
            return;
        }
        if(target < 0){
            return;
        }
        // so nwo here
        for(int i = index; i >0; i--){
            ls.add(i);
            helper(target - (i*i) , ls , i);
            ls.remove(ls.size()-1);
        }
    }
}
