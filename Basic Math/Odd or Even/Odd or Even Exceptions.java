class Solution {
    public static boolean isEven(int n) {
        if (n < 0 || n > 10000) {
            throw new IllegalArgumentException("Input must be between 0 and 10000.");
        }
        return (n & 1) == 0;
    }
}
