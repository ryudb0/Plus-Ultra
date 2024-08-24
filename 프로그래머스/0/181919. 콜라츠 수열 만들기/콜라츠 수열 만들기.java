import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        cola(n, list);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    public void cola(int n, List<Integer> list) {
        list.add(n);
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            n /= 2;
            cola(n, list);
            return;
        }
        if (n % 2 == 1) {
            n = 3 * n + 1;
            cola(n, list);
        }
    }
}