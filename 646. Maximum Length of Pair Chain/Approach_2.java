class Solution {
    public int findLongestChain(int[][] pairs) {
        int maxPairs = 1;
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int end = pairs[0][1];
        for(int i = 1; i<pairs.length; i++){
            if(pairs[i][0]>end){
                maxPairs++;
                end = pairs[i][1];
            }
        }
        return maxPairs;
    }
}