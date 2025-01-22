import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> wordsUsed = new HashSet<>();
        char lastCharacter = ' ';

        for (int i = 0; i < words.length; i++) {
//            버퍼를 주고 앞에 나온 단어의 끝과 뒷 단어의 앞이 일치하는지 확인해야함
            String word = words[i];
            boolean charaterSame = lastCharacter == word.charAt(0);

            boolean added = wordsUsed.add(word);
            if (i == 0) {
                lastCharacter = word.charAt(word.length() - 1);
                continue;
            }
            if (!added || !charaterSame) {
                return new int[]{i % n + 1, i / n + 1};
            }
            lastCharacter = word.charAt(word.length() - 1);
        }

        return new int[]{0, 0};
    }

}