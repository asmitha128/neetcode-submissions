class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int x=nums.length;
        int current=1;
        int max=1;
        if(x==0){
            return 0;
        }
        for(int i=0;i<x-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]==nums[i+1]-1){
                current++;
            }
            else {
                current = 1;
            }

            max=Math.max(max,current);
        }
        return max;
    }
}
