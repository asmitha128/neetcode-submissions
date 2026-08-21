class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:nums){
           h1.put(i,h1.getOrDefault(i,0)+1);
                }
                List<Integer> list =new ArrayList<>(h1.keySet());
                list.sort((a,b)->h1.get(b)-h1.get(a));

                int []result=new int[k];
                for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
          return result;
    }
}
