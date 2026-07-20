class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        return isDuplicate(nums, k) ;
    }

    public boolean isDuplicate(int[] arr, int k)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length && j <= i+k ; j++)
            {
                if(arr[i] == arr[j])
                {
                    if(j-i <= k) return true ;
                }
            }
        }
        return false ;
    }
}