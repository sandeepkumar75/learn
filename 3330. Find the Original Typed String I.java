// https://leetcode.com/problems/find-the-original-typed-string-i/description/

class Solution {
    public int possibleStringCount(String word) {
        // int [] freq = new int[26];
        // for(char c : word.toCharArray()){
        //     freq[c - 'a']++;
        // }
        // int res = 1;
        // for(int i=0; i<26; i++){
        //     if(freq[i] > 1){
        //         res = res + freq[i] - 1;
        //     }
        // }
        // return res;
        int ans=1;
        char [] c = word.toCharArray();
        for(int i=1;i<word.length();i++){
            if(c[i]==c[i-1]) ans++;
        }
        return ans;
    }
}
