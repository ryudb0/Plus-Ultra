class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            String value = seoul[i];
            if (value.equals("Kim")) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}