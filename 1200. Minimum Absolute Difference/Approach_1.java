class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minDifference = Math.abs(arr[0]-arr[1]);
        for(int i = 1; i < arr.length-1; i++){
            minDifference = Math.min(minDifference,Math.abs(arr[i]-arr[i+1]));
        }
        for(int i = 0; i < arr.length-1; i++){
            if(Math.abs(arr[i]-arr[i+1]) == minDifference){
              result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return result;
    }
}