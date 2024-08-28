class Solution {
    boolean solution(String s) {

        String str = s.toLowerCase();
        str = str.replaceAll("[^py]", "");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                count++;
                continue;
            }
            count--;
        }
        return count == 0;

    }
}