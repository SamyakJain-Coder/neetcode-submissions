class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int num = st.pop();
                int num1 = st.pop();
                st.push(num+num1);
            }else if(tokens[i].equals("-")){
                int num = st.pop();
                int num1 = st.pop();
                st.push(num1-num);
            }else if(tokens[i].equals("*")){
                int num = st.pop();
                int num1 = st.pop();
                st.push(num1*num);
            }else if(tokens[i].equals("/")){
                int num = st.pop();
                int num1 = st.pop();
                st.push(num1/num);
            }else{
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            }
        }
        return st.peek();
    }
}
