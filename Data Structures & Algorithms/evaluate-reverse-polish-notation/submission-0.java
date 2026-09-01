class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int result=0;
        for(String c: tokens){
            
             if (c.equals("+")|| c.equals("-")|| c.equals("*") || c.equals("/")){
               int x=st.pop();
              int  y=st.pop();
                 if(c.equals("+")){
                     result=x+y;
                 }
                 else if(c.equals("-")){
                     result=y-x;
                 }
                 else if (c.equals("*")){
                     result=x*y;
                 }
                 else{
                     result=y/x;
                 }
                  st.push(result);
            }
           else{
            st.push(Integer.parseInt(c));
           }

        }
        
        return st.peek();
    }
}
