class Solution {
    public static boolean isEven(int n) {
        return (n >= 0 && n <= 10000) ? (n % 2 == 0) : false;
    }
}
