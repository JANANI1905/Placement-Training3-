class Solution {
    public int minTimeToType(String word) {
        char[] arr = word.toCharArray();
        int res = Math.min(
                Math.abs('a' - arr[0]),
                Math.abs(Math.abs(arr[0] - 'a') - 26)
        );

        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            if (j == arr.length) continue;
            char char1 = arr[i];
            char char2 = arr[j];

            res += Math.min(
                    Math.abs(char1 - char2),
                    Math.abs(Math.abs(char2 - char1) - 26)
            );
        }

        return res + arr.length;
    }
}
