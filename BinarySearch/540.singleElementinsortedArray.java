//https://leetcode.com/problems/single-element-in-a-sorted-array/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return nums[0];

        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;

        while(start<end) 
        {
            if(nums[mid] != nums[mid+1]) {
                int len = end-mid;
                if(len%2 == 0) {
                    end = mid;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                int len = end - (mid-1);
                if(len % 2 == 0) {
                    end = mid-1;
                }
                else {
                    start = mid;
                }
            }

            mid = start + (end-start)/2;
        }
        return nums[start];
    }
}
