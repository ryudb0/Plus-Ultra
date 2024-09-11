class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        for (int i = 1; ; i++) {
            if (s.equals("1")) {
                break;
            }
            int onlyOne = s.replaceAll("0", "").length();
            int removeZero = s.length() - onlyOne;
            s = Integer.toBinaryString(onlyOne);

            answer[0] = i;
            answer[1] += removeZero;
        }
        return answer;
    }
}