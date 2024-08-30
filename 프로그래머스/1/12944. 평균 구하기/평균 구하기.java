import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();

        return sum / (double)count;

    }
}