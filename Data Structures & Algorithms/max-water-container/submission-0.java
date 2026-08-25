class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int i=0;
        int max=0;

        while(left<right){
          int  area=Math.min(heights[left],heights[right])*Math.abs(left-right);
           max = Math.max(max, area);
            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
           
           }
           return max;
        }
    }

