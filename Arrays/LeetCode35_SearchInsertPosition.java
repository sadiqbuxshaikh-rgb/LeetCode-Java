class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        boolean isFound = false;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==target)
            {
                isFound = true;
                return i;
            }
        }
        if(isFound== false)
        {
            int []newArray = new int[nums.length+1];
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i]>target)
                {
                    return i;
                }
            }
        }
        return nums.length;
    }
}
