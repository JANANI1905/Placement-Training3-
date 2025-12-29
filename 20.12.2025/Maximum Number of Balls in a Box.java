class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[46];
        int maxCount = 0;

        for (int i=lowLimit; i<=highLimit; i++) {
            int sumOfDigits = 0;
            int temp = i;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            count[sumOfDigits]++;
            maxCount = Math.max(maxCount, count[sumOfDigits]);
        }

        return maxCount;
    }
}
