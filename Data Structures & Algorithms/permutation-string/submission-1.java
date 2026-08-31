class Solution {
    public boolean checkInclusion(String s1, String s2) {

         if (s1.length() > s2.length()) {
            return false;
        }

        int [] chars1=new int[26];
        int [] chars2=new int[26];

    for (char c:s1.toCharArray()){
        chars1[c-'a']++;
    }
      
        for(int left=0;left<s1.length();left++){
            chars2[s2.charAt(left)-'a']++;
        }

        if(Arrays.equals(chars1, chars2)) {
            return true;
        }

    int k = 0;
        int right = s1.length();

       
        while(right < s2.length()) {
            chars2[s2.charAt(right) - 'a']++; 
            chars2[s2.charAt(k) - 'a']--;     
            if(Arrays.equals(chars1, chars2)) {
                return true;
            }
        right++;
        k++;
       
     }
     return false;

       }
      
    }

