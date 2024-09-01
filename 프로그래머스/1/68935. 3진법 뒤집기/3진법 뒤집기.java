import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> triList = dec2tri(n);
        int sum = 0;
        for (int i = 0; i < triList.size(); i++) {
            sum += (int)(triList.get(i) * Math.pow(3, triList.size() - (i + 1)));
        }
        return sum;
    }

    private List<Integer> dec2tri(int copy) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            list.add(copy % 3);
            if (copy < 3) {
                break;
            }
            copy /= 3;
        }
        return list;
    }
}