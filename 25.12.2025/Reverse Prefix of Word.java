class Solution {
    void swap(char arr[], int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public String reversePrefix(String word, char ch) {

        char arr[] = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                swap(arr, 0, i);
                return new String(arr);
            }
        }
        return word;
    }
}
