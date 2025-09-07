class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;    // simple increment
                return digits;  // no carry, done
            }
            digits[i] = 0;      // carry over
        }

        // If we reach here, all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;        // 100...0
        return result;
    }
}
