class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hpCareTime = bandage[0];
        int dotCare = bandage[1];
        int plusCare = bandage[2];
        int maxHp = health;
        int round = attacks[attacks.length - 1][0];
        int count = 0;

        for (int i = 1, j = 0; i <= round; i++) {
            int monsterRound = attacks[j][0];
            int monsterAttack = attacks[j][1];

            if (i == monsterRound) {
                health -= monsterAttack;
                j++;
                count = 0;
                if (health <= 0) {
                    return -1;
                }
                continue;
            }

            count++;
            int tempHP = health + dotCare;
            if (hpCareTime == count) {
                tempHP += plusCare;
                count = 0;
            }
            if (maxHp <= tempHP) {
                tempHP = maxHp;
            }
            health = tempHP;

            if (health <= 0) {
                return -1;
            }
        }
        return health;
    }
}