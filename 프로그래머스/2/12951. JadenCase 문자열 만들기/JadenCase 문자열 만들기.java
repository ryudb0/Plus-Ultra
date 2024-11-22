class Solution {
    public String solution(String s) {
        String[] splitedStr = s.split(" ", -1);
        String[] temp = new String[splitedStr.length];
        for (int i = 0; i < splitedStr.length; i++) {
            if(splitedStr[i].equals("")) {
                temp[i] = splitedStr[i];
                continue;
            }
            String lowerCase = splitedStr[i].toLowerCase();
            char ch = lowerCase.charAt(0);
            char upperCase = Character.toUpperCase(ch);
            String substring = lowerCase.substring(1);
            temp[i] = upperCase + substring;

        }
        return String.join(" ", temp);
    }

}