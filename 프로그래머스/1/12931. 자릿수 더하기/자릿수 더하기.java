import java.util.*;

public class Solution {
    public int solution(int n) {
        int number = n;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}