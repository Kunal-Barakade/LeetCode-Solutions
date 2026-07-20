class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return frequency(nums) ;
    }

    public List<Integer> frequency(int[] nums)
    {
        List<Integer> list = new ArrayList<>() ;
        boolean[] b = new boolean[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++)
        {   if(b[i]) continue ;
            int cnt = 1 ;
            for(int j = i+1 ; j < nums.length ; j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++ ;
                    b[j] = true ;
                }
            }
            if(cnt > nums.length/3) 
               list.add(nums[i]) ;
        }
        return list ;
    }
}

