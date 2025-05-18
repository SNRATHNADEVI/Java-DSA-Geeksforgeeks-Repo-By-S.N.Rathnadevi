class Solution {
    public static boolean isEven(int n) {
        if (n >= 0 && n <= 10000) {
            return n % 2 == 0;
        }
        return false;
    }
}
