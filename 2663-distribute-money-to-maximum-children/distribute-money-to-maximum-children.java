class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1;
        if (money < 8) return 0;
        money -= children;
        int cnt8 = 0;
        while (money >= 7 && children > 0) {
            money -= 7;
            cnt8++;
            children--;
        }
        if (children == 1 && money == 3) {
            return cnt8 - 1;
        }
        if (children == 0 && money > 0) {
            return cnt8 - 1;
        }
        return cnt8;
    }
}
