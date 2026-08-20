class Solution {
    public boolean isAnagram(String s, String t) {
  HashMap<Character,Integer> freq1=new HashMap<>();
  HashMap<Character,Integer> freq2=new HashMap<>();
int x=s.length();
int y=t.length();
if(x != y){
    return false;
}
  for(char i: s.toCharArray()){
   freq1.put(i,freq1.getOrDefault(i,0)+1);
  }
  for(char j: t.toCharArray()){
   freq2.put(j,freq2.getOrDefault(j,0)+1);
  }


return freq1.equals(freq2);



    }
}
