class Solution {
    public List<List<Integer>> threeSum(int[] arr) {


    if (arr == null || arr.length < 3) return new ArrayList<>();

    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    for (int i = 0; i < arr.length - 2; i++)
    {

      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {

          result.add(Arrays.asList(arr[i], arr[left], arr[right]));
          left++;
          right--;
        } else if (sum < 0)
          left++;
        else
          right--;
      
        }
    }

    return new ArrayList<>(result);
    
    }
}