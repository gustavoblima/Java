// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {
    //public int[] A = {1, 3, 6, 4, 1, 2};
    public int solution(int[] A) {
        // write your code in Java SE 8
        
    int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            return i;
            }
        }
        
        return 0;
    }
}