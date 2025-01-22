import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> noAds = new ArrayList<>();
        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            }
            noAds.add(str);
        }
        return noAds;
    }

}