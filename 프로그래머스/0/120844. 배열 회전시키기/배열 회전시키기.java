import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, String direction) {

        if (direction.equals("right")) {
            return IntStream.range(0, numbers.length)
                    .map(i -> numbers[(i + numbers.length - 1) % numbers.length]).toArray();
        }
        return IntStream.range(0, numbers.length)
                .map(i -> numbers[(i + 1) % numbers.length]).toArray();
    }
}