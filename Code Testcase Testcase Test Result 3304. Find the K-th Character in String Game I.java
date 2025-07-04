//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/submissions/1686362045/?envType=daily-question&envId=2025-07-03

class Solution {
    public char kthCharacter(int k) {
       List<Integer> asc = new ArrayList<>();
       asc.add(0);
        while(asc.size() < k){
            if(asc.size() < k){
                int temp = asc.size();
                for(int i=0; i<temp; i++){
                    asc.add((asc.get(i)+1) % 26);   //For new alphabet.
                }
            }
        }
        return (char)(asc.get(k-1) + 'a');
    }
}
