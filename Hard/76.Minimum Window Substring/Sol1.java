import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
     
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        
        int left = 0; 
        int minLen = Integer.MAX_VALUE; 
        int minLeft = 0; 
        int count = tMap.size(); 

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            if (tMap.containsKey(rightChar)) {
                tMap.put(rightChar, tMap.get(rightChar) - 1);
                if (tMap.get(rightChar) == 0) {
                    count--;
                }
            }

  
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                if (tMap.containsKey(leftChar)) {
                    tMap.put(leftChar, tMap.get(leftChar) + 1);
                    if (tMap.get(leftChar) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
