class Solution {
    public boolean isValid(String s) {
        int top = -1;
        char st[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                st[++top] = s.charAt(i);
        }else{
            if(top==-1)return false;
            if(s.charAt(i)==')'){
                if(st[top--]!='(')return false;
            }else if(s.charAt(i)==']'){
                if(st[top--]!='[')return false;
            }else{
                if(st[top--]!='{')return false;
            }
        }
    }
    if(top!=-1)return false;
       return true;
}
}
