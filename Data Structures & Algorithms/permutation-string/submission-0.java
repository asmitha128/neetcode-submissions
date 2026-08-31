class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] chars1=new int[26];
    for (char c:s1.toCharArray()){
        chars1[c-'a']++;
    }
      
        int left=0;
        int count=0;
        int right=s1.length()-1;
     while(right<s2.length()){
          int [] chars2=new int[26];
        for(int i=left;i<left+s1.length();i++){
        chars2[s2.charAt(i)-'a']++;
        }

         if(Arrays.equals(chars1,chars2)){
            return true;
         }
        right++;
        left++;
       
     }
     return false;

       }
      
    }

