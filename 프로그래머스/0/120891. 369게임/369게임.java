class Solution {
    public int solution(int order) {
        String str = "" + order;
        str = str.replaceAll("[^369]", "");
        return str.length();

    }
}