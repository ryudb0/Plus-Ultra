class Solution {
    public String solution(int[] numLog) {
        StringBuilder str = new StringBuilder();
        for (int i = numLog.length-1; i > 0; i--) {
            int sub = numLog[i] - numLog[i - 1];
            if (sub == 1) {
                str.append("w");
                continue;
            }
            if (sub == -1) {
                str.append("s");
                continue;
            }
            if (sub == 10) {
                str.append("d");
                continue;
            }
            if (sub == -10) {
                str.append("a");
            }
        }
        return str.reverse().toString();

    }
}