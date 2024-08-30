class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        long sum = 0;
        for (int i = 0; i < signs.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return (int)sum;
    }
}