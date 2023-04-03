class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0, el1 = -1, el2 = -1;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == el1)
            count1++;
            else if (nums[i] == el2)
            count2++;
            else if (count1 == 0) {
            el1 = nums[i];
            count1 = 1;
            } else if (count2 == 0) {
            el2 = nums[i];
            count2 = 1;
            } else {
            count1--;
            count2--;
            }
        }
    
    ArrayList < Integer > ans = new ArrayList < Integer > ();
    count1 = 0;
    count2 = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i]==el1) count1++;
        else if(nums[i]==el2) count2++;
    }
    if (count1 > nums.length / 3)
      ans.add(el1);
    if (count2 > nums.length / 3)
      ans.add(el2);
    return ans;
}
}
