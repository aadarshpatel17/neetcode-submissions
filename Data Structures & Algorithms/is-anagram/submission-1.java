class Solution {
    public boolean isAnagram(String s, String t) {

        int[] ch = new int[26];

        for(int i=0; i<s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            ch[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++) {
            if(ch[i] != 0)
                return false;
        }

        return true;

        // Map<Character, Integer> mapS = new HashMap<>();
        // Map<Character, Integer> mapT = new HashMap<>();
        
        // for(char c: s.toCharArray()) {
        //     mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        // }
        // for(char c: t.toCharArray()) {
        //     mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        // }
        // return mapS.equals(mapT);
    }
}
