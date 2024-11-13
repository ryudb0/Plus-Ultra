import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int index = 0; index < commands.length; index++) {
            int[] intArr = commands[index];
            int i = intArr[0]-1;
            int j = intArr[1]-1;
            int k = intArr[2]-1;
            int[] copyArr = new int[j - i + 1];
            System.arraycopy(array,i, copyArr, 0, j-i+1);
            Arrays.sort(copyArr);
            answer[index] = copyArr[k];
        }
        return answer;
    }
}