class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Integer index[] = new Integer[position.length];
        for(int i=0;i<index.length;i++){
            index[i] = i;
        }
        Arrays.sort(index,(a,b)->Integer.compare(position[b],position[a]));
        Stack<Double> st = new Stack<>();
        for(int i=0;i<index.length;i++){
            int j = index[i];
            double time = (double)(target-position[j])/speed[j];
            if(st.empty()||time>st.peek()){
                st.push(time);
            }
        }
        return st.size();
    }
}
