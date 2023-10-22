//  Solution 1
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int i = 0;
        for(int n: nums){
            if(!set.contains(n)){
                set.add(n);
                nums[i++] = n;
            }
        }
        return i;
    }
}

//  Solution 2
class Solution {
    public int removeDuplicates(int[] nums) {
        int last = Integer.MIN_VALUE;
        int i = 0;
        for(int n: nums){
            if(last != n){
                last = n;
                nums[i++] = n;
            }
        }
        return i;
    }
}

//Solution 3

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

// Solution 4
class Solution {
    private void shiftByNum(int[] nums, int by, int pos) {
        for (int i = pos; i + by < nums.length; i++) {
            nums[i] = nums[i + by];
        }
    }
    public int removeDuplicates(int[] nums) {
        int c = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; nums[i] != nums[nums.length - 1]; i++) {
            int curElm = nums[i], nuOfA = 0, pos = i + 1;
            while (pos < nums.length) {
                if (curElm == nums[pos]) {
                    nuOfA++;
                } else {
                    break;
                }
                pos++;
            }
            if (nuOfA > 0) {
                shiftByNum(nums, nuOfA, i);
            }
            c++;
        }
        
        return c + 1;
    }
}

