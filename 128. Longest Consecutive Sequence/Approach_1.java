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