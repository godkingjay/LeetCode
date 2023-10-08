class Solution{
public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();
    if(nums.length < 3){
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(!result.contains(nums[i]))
                result.add(nums[i]);
        }
        return result;
    }
        
    Arrays.sort(nums);
    int count=1;
    int gt = nums.length/3;
    for(int i=0; i<nums.length-1; i++){
        if(nums[i] == nums[i+1]){
            count++;
        }
        if(count > 1 && nums[i] != nums[i+1]){ 
            count = 1;
        }
        if(count >= gt+1){
                if(!result.contains(nums[i])){
                    result.add(nums[i]);
                    count = 1;
                }
            }
        }
    return result;
    }
}