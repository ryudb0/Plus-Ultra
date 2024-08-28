class Solution {
    public int[] solution(long n) {
        String str = n + "";
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int)(n % 10);
            n /= 10;
        }
        return arr;

    }
}