public class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");

        //StringBuilder to store the result.
        StringBuilder result = new StringBuilder();
        
        int end = words.length - 1;
        
        for(int i = 0; i<= end; i++){
            // Check if the current word is not empty.
            if(!words[i].isEmpty()) {
                // Insert the current word at the beginning of the 'result'.
                result.insert(0, words[i]);
                if(i < end) {
                    // Add a space before the current word if it's not the last word.
                    result.insert(0, " ");
                }
            }
        }
        
        return result.toString();
    }
}
