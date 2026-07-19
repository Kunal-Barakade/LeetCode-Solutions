class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums) ;

        int n = 0 ;
        for(int ele : nums)
        {
            if(n != ele) return n ;

            n++ ;
        }
        return ++nums[nums.length-1] ;
    }
}