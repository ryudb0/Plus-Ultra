import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String copy = s;
        String[] splitedNumber = copy.split(" ");
        int[] array = Arrays.stream(splitedNumber).mapToInt(Integer::parseInt).sorted().toArray();
        String answer = "";
        answer = array[0] + " " + array[array.length - 1]; 
        return answer;
    }
}