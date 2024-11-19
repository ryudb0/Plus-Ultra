class Solution {
    public int[] solution(int num, int total) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += i;
        }
        int firstNumber = (total - sum) / num;
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = firstNumber + i;
        }
        return answer;
    }
}