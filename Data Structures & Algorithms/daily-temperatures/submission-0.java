class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            while(!st.empty()&&arr[i]>arr[st.peek()]){
                int index = st.pop();
                ans[index] = i - index; 
            }
            st.push(i);
        }
        return ans;
    }
}
