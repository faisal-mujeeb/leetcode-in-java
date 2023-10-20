class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int val=nums[0];
        for(int i:nums){
            if(i==0)return 0;
            if(i>0){
                ans=i;break;
            }
            val=i;
        }
        
        if(ans==0)return nums[nums.length-1];
        if(Math.abs(val)<ans)return val;
        return ans;
    }
}