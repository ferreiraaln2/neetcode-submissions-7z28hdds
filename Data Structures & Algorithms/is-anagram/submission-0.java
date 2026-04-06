class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] counts = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            char current  = s.charAt(i);
            counts[current - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            char current  = t.charAt(i);
            counts[current - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) return false;
        }

        return true;
    }
}
