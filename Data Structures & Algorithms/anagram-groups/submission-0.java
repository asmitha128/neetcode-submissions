class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h1=new HashMap<>();
        for(String s: strs){
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

        h1.putIfAbsent(key,new ArrayList<>());
        h1.get(key).add(s);
        }
        return new ArrayList<>(h1.values());
    }
}
