# [189. Rotate Array](https://leetcode.com/problems/rotate-array/)

<div class="xFUwe" data-track-load="description_content"><p>Given an integer array <code>nums</code>, rotate the array to the right by <code>k</code> steps, where <code>k</code> is non-negative.</p>

<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong> 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>0 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>

<p><strong>Follow up:</strong></p>

<ul>
	<li>Try to come up with as many solutions as you can. There are at least <strong>three</strong> different ways to solve this problem.</li>
	<li>Could you do it in-place with <code>O(1)</code> extra space?</li>
</ul>
</div>

---

### Explaination of the approach:

**Step 1:** n is assigned the length of the input array nums. This determines the number of elements in the array.

**Step 2:** k is taken modulo n to ensure that it is within the range (0, n). This is because if k is larger than n, rotating the array by k positions is equivalent to rotating it by k % n positions.

**Step 3:** If k is negative, it is adjusted by adding n to it. This is to handle cases where k is a negative number. Adding n to a negative k effectively rotates the array to the left.

**Step 4:** An auxiliary array temp of the same length as nums is created. This array will be used to store the rotated elements.

**Step 5:** The loop copies the elements from nums to temp with a right shift of k positions. The modulo operation is used to ensure that the indices wrap around if they exceed the length of the array.

**Step 6:** Finally, another loop copies the rotated elements from the temp array back to the original nums array.

### Time Complexity:

The code performs two separate loops through the array, each with n iterations. Therefore, the time complexity is O(n).

### Space Complexity:

The code uses an additional temp array of the same size as the input array nums. So the space complexity is O(n) as well.
