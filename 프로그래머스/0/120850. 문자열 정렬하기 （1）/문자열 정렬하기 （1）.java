import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if ('0' <= c && c <= '9') {
                list.add(c - '0');
            }
        }
        return list.stream().sorted().mapToInt(Integer::valueOf).toArray();
    }
}