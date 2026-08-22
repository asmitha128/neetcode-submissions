class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int x=nums.length;
        Arrays.sort(nums);
       int j=0;
       if(x==0){
        return 0;
       }
       if(x==1){
        return 1;
       }
        for(int i=0;i<x-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i]==nums[i+1]-1){
                  h1.put(j, h1.getOrDefault(j, 1) + 1);
            }
            else{
                j=j+1;
                continue;
                
            }

        }
        int max=1;
        for (int val: h1.values()){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}
