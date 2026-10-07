class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int vol = Math.min(height[left],height[right])*(right-left);
            max = Math.max(max,vol);
            if(height[left]<height[right])left+=1;
            else right-=1;
        }
        return max;
    }
}