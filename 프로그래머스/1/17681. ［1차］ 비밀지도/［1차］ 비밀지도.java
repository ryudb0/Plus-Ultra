class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] treasureMap = new String[n];
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            treasureMap[i] = padding(binary, n);
        }
        for (int i = 0; i < n; i++) {
            treasureMap[i] = treasureMap[i].replaceAll("1", "#");
            treasureMap[i] = treasureMap[i].replaceAll("0", " ");
        }
        return treasureMap;
    }

    private String padding(String binary, int length) {
        String zero = "";
        for (int i = binary.length(); i < length; i++) {
            zero += "0";
        }
        return zero + binary;
    }
}