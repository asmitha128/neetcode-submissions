class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:nums){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
            List<Integer>[] bucket=new ArrayList[nums.length+1];
            for(int num:h1.keySet()){
                int f=h1.get(num);
                if(bucket[f]==null){
                    bucket[f]=new ArrayList<>();
                }
                bucket[f].add(num);
            }
            int[] result = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
    }
    return result;
}
}
