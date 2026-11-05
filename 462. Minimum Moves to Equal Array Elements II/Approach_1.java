class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1 || nums.length == 0){
            return 0;
        }
        int minMoves = 0;
        Arrays.sort(nums);
        int secMax = nums[nums.length/2];
        for(int i = 0; i<nums.length; i++){
                minMoves += Math.abs(secMax-nums[i]);
            }
        return minMoves;
    }
}