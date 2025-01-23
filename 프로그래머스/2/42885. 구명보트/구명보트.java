import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        List<Integer> list = new ArrayList<>();
        for (int person : people) {
            list.add(person);
        }
        int count = 0;

        while (list.size() >= 2) {

            int firstPerson = 0;
            int lastPerson = list.size() - 1;
            int weight = list.get(firstPerson) + list.get(lastPerson);

            if (weight > limit) {
                list.remove(lastPerson);
            } else {
                list.remove(lastPerson);
                list.remove(firstPerson);
            }
            count++;
        }
        return list.isEmpty() ? count : ++count;
    }

}