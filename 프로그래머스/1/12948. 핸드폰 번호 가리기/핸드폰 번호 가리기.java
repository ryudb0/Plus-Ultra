class Solution {
    public String solution(String phone_number) {
        String copyPhoneNumber = phone_number;
        int lastNumberIndex = phone_number.length() - 4;
        String lastNumber = copyPhoneNumber.substring(lastNumberIndex);
        String answer = "";
        for (int i = 0; i < lastNumberIndex; i++) {
            answer += "*";
        }
        return answer + lastNumber;
    }
}