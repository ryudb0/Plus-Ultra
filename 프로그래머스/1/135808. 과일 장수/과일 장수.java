import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }
        int[] copy = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int appleBoxSize = (copy.length / m) * m;
        int[] appleBox = new int[appleBoxSize];
        System.arraycopy(copy, 0, appleBox, 0, appleBoxSize);

        int totalPrice = 0;
        int applePrice = m - 1;

        for (int i = applePrice; i < appleBox.length; i += m) {
            totalPrice += copy[i] * m;
        }

        return totalPrice;
    }
}