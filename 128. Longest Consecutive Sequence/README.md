# 128. Longest Consecutive Sequence

### Difficulty: Medium

## Description
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 
Example 1:


Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.


Example 2:


Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


Example 3:


Input: nums = [1,0,1,2]
Output: 3


 
Constraints:


	0 <= nums.length <= 105
	-109 <= nums[i] <= 109

## Submission Details
- **Status**: Accepted
- **Runtime**: 32
- **Memory**: 95008000
- **Language**: java

## Code
```java
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int LongestConq = 0;
        for(int num:nums){
            set.add(num);
        }
        for(int i : set){
            if(set.contains(i+1)){
                continue;
            }
            int current = i;
            int currentMax = 1;
            while(set.contains(current-1)){
                current = current-1;
                currentMax++;
            }
             LongestConq = Math.max(currentMax,LongestConq);
        }
        return LongestConq;
    }
}
```
