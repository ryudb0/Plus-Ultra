import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] subfix = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            String subWord = my_string.substring(i);
            subfix[i] = subWord;
        }
        Arrays.sort(subfix);
        return subfix;
    }
}