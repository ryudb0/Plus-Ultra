import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int totalSum = IntStream.range(0, 10).sum();
        int numberSum = Arrays.stream(numbers).sum();
        return totalSum - numberSum;
    }
}