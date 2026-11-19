class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxWater = 0;
        while(l<r){
            int minHeight = Math.min(height[l],height[r]);
            int weight = r-l;
            maxWater = Math.max(minHeight*weight,maxWater);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}