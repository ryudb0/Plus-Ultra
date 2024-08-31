import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, copy.length);
        if (arr.length == 1) {
            return new int[]{-1};
        }
        Arrays.sort(copy);
        int min = copy[0];
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}