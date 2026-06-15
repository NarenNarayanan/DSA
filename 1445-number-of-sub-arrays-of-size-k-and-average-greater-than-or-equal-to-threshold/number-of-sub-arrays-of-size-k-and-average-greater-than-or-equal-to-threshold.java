class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int left = 0;
        int sum = 0;
        int target = threshold * k;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            if (right - left + 1 > k) {
                sum -= arr[left++];
            }

            if (right - left + 1 == k && sum >= target) {
                ans++;
            }
        }

        return ans;
    }
}