class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        int lastElement = num_list[num_list.length - 1];
        int prevLastElement = num_list[num_list.length - 2];
        int returnElement = lastElement > prevLastElement ? lastElement - prevLastElement : lastElement * 2;
        answer[answer.length - 1] = returnElement;
        return answer;
    }
}