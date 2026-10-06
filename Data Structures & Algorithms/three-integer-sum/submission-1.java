class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target = -1*nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(left==i)left+=1;
                if(right==i)right-=1;
                if(nums[left]+nums[right]<target)left+=1;
                else if(nums[left]+nums[right]>target)right-=1;
                else{
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[left]);
                    list1.add(nums[i]);
                    list1.add(nums[right]);
                    Collections.sort(list1);
                    if(!list.contains(list1)){
                        list.add(list1);
                    }
                    left+=1;
                    right-=1;
                }
            }
        }
        return list;
    }
}
