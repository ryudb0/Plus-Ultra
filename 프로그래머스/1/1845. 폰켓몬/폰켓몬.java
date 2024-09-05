import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int phonekemon = nums.length/2;
        int[] array = Arrays.stream(nums).distinct().toArray();
        return Math.min(array.length, phonekemon);
    }
}