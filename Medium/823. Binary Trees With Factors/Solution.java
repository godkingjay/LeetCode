public class Solution {
	// Method to count the number of binary trees that can be formed
	public int numFactoredBinaryTrees(int[] arr) {
		// Sort the array
	        Arrays.sort(arr);
	        // Create a map to store the count of subtrees for each element
	        Map<Integer, Long> subtreeCount = new HashMap<>();
	        for (int root : arr) {
	            subtreeCount.put(root, 1L);
	            for (int factor : arr) {
	                if (factor >= root) {
	                    break;
	                }
	
	                /* Check if the current factor is a factor of the root 
	                 * and if the root/factor is present in the map */
	                if (root % factor == 0 && subtreeCount.containsKey(root / factor)) {
	                	// Update the subtree count for the current root
	                    subtreeCount.put(root, 
	                    		(subtreeCount.get(root) + subtreeCount.get(factor) * subtreeCount.get(root / factor)));
	                }
	            }
	        }
	
	        long totalTrees = 0L;
	        for (int key : subtreeCount.keySet()) {
	            totalTrees = (totalTrees + subtreeCount.get(key)) % 1_000_000_007;
	        }

		return (int) totalTrees;       
	}
}
