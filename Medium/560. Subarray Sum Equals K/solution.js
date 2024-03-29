const subarraySum = function(nums, k) {
    const hashTable = {
        0:1,
    }
    let sum = 0
    let count =0
    for(let i=0; i < nums.length; i++){
        sum += nums[i]
     
        if([sum - k] in hashTable){
            count += hashTable[sum - k]

        }
        hashTable[sum] = (hashTable[sum] || 0 ) + 1
    }
    return count
};