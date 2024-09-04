class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        String str1 = sb.toString();
        str1 += "0";
        String str2 = sb.reverse().toString();
        return str1 + str2;
    }
}