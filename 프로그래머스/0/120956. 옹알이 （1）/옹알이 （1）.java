class Solution {
    public int solution(String[] babbling) {
        String[] babbles = {"aya", "ye", "woo", "ma",
                "ayaye", "ayawoo", "ayama",
                "yeaya", "yewoo", "yema",
                "wooaya", "wooye", "wooma",
                "maaya", "maye", "mawoo",
                "ayayewoo", "ayayema", "ayawooye", "ayawooma", "ayamaye", "ayamawoo",
                "yeayawoo", "yeayama", "yewooaya", "yewooma", "yemaaya", "yemawoo",
                "wooayaye", "wooayama", "wooyeaya", "wooyema", "woomaaya", "woomaye",
                "maayaye", "maayawoo", "mayeaya", "mayewoo", "mawooaya", "mawooye",
                "ayayewooma", "ayayemawoo", "ayawooyema", "ayawoomaye", "ayamayewoo", "ayamawooye",
                "yeayawooma", "yeayamawoo", "yewooayama", "yewoomaaya", "yemaayaye", "yemawooaya",
                "wooayayema", "wooayamaye", "wooyeayama", "wooyemaaya", "woomaayaye", "woomayeaya",
                "maayayewoo", "maayawooye", "mayeayawoo", "mayewooaya", "mawooayaye", "mawooyeaya"
        };
        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (String b : babbles) {
                if (babbling[i].equals(b)) {
                    count++;
                }
            }

        }
        return count;
    }
}