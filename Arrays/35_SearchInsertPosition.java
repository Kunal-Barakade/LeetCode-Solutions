class Solution {
    public int searchInsert(int[] nums, int target) {
       if(nums[nums.length-1] < target)
        return nums.length ; 
    


        int min = 0 ;
        int max = nums.length-1 ;
        int mid = 0 ;
        while(min <= max)
        {
            mid = min+(max-min)/2 ;
            if(target > nums[mid]) min = mid+1 ;
            else if(target < nums[mid]) max = mid-1 ;
            else return mid ;
        }

    return min ;
    }
}
