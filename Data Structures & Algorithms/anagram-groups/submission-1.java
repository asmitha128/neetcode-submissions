class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h1=new HashMap<>();
        for(String s: strs){
           int []count=new int[26];
           for (char c: s.toCharArray()){
            count[c-'a']++;

           }
        String key=Arrays.toString(count);
        h1.putIfAbsent(key,new ArrayList<>());
        h1.get(key).add(s);
        }
        return new ArrayList<>(h1.values());
    }
}
