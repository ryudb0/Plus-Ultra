import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = n + "";
        String[] splitNumber = str.split("");
        Arrays.sort(splitNumber, Collections.reverseOrder());
        str = String.join("", splitNumber);
        return Long.parseLong(str);

    }
}