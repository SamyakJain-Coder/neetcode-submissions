class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(!map.contains(nums[i]-1)){
                int count = 0;
                while(map.contains(nums[i]+count)){
                    count+=1;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
