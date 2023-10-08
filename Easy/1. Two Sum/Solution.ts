function twoSum(nums: number[], target: number): number[] | void {
  const numToIndex = new Map<number, number>();
  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    if (numToIndex.has(complement)) return [numToIndex.get(complement)!, i];
    numToIndex.set(nums[i], i);
  }
  return;
}
