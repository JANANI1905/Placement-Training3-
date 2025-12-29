class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]arr=new int[26];
        Arrays.fill(arr,0);
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int freq=arr[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(arr[i]==0)continue;
            else if(arr[i]!=freq)return false;
        }
        return true;
    }
}
