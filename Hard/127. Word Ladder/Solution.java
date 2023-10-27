/*
Simply, this is the idea:
                    hit
                    /    
                hot
             /       \
           dot       lot
          /   \
         dog   lot
        /   \       
       cog   log
    ✅
*/
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet(wordList);
        if(!set.contains(endWord)) return 0;
        HashSet<String> visited = new HashSet();
        Queue<String> queue = new LinkedList();
        queue.add(beginWord);
        visited.add(beginWord);
        int trans = 1;
        while(!queue.isEmpty()){
            int s = queue.size();
            for(int j=0;j<s;j++){
                String word = queue.poll();
                if(word.equals(endWord)) return trans;
                for(int i=0;i<word.length();i++){
                    for(int k='a';k<='z';k++){
                        char wordArr[] = word.toCharArray();
                        wordArr[i] = (char) k;
                        String temp = new String(wordArr);
                        if(set.contains(temp) && !visited.contains(temp)){
                            queue.add(temp);
                            visited.add(temp);
                        }
                    }
                }
            }
            trans++;
        }
        return 0;
    }
}