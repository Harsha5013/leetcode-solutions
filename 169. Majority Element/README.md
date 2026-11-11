# 169. Majority Element

### Difficulty: Easy

## Description
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

 
Constraints:


	n == nums.length
	1 <= n <= 5 * 104
	-109 <= nums[i] <= 109
	The input is generated such that a majority element will exist in the array.


 
Follow-up: Could you solve the problem in linear time and in O(1) space?

## Submission Details
- **Status**: Accepted
- **Runtime**: 2
- **Memory**: 62792000
- **Language**: java

## Code
```java
class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for(int i = 1 ; i<nums.length; i++){
            if(nums[i] == major){
                count++;
            }else if(count == 0){
                major = nums[i];
                count = 1;
                }else{
                count --;
            }
        }
       return major;
    }
}
```
