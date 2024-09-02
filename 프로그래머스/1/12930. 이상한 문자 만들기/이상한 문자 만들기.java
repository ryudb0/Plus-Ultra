class Solution {
    public String solution(String s) {
        String copy = s.toLowerCase();
        String[] split = copy.split("");
        StringBuilder sb = new StringBuilder();
        int evenWord = 0;
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (word.equals(" ")) {
                sb.append(word);
                evenWord = 0;
                continue;
            }
            if (evenWord % 2 == 0) {
                sb.append(word.toUpperCase());
                evenWord++;
                continue;
            }
            sb.append(word);
            evenWord++;
        }
        return sb.toString();
    }
}