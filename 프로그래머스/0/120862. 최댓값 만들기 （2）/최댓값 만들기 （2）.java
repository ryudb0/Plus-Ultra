import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[0] * numbers[1];
        int anotherMax = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return Math.max(max, anotherMax);
    }
}