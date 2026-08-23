class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x=nums.length;
        int prod=1;
        int []a=new int[x];
         int count=0;
        for(int i=0;i<x;i++){
            if(nums[i]==0){
                count++;
                continue;
            }
            prod=prod*nums[i];
        }
       
        for(int i=0;i<x;i++){
            if(count>1){
                a[i]=0;
            }

            if(count==1 && nums[i]!=0){
                a[i]=0;
            }
            else if(count==1 && nums[i]==0){
                a[i]=prod;
            }
            else if(count==0){
                a[i]=prod/nums[i];
            }
        }
        return a;
    }
}  
