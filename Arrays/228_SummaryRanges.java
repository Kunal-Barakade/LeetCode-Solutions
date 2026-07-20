class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>() ;
        String str = "" ;
        
        if(nums.length == 0) return list ;
        int start = nums[0] , end = 0 ;

        for(int i = 0 ; i < nums.length-1 ; i++)
        {
            if(nums[i]+1 != nums[i+1])
            {
                end = nums[i] ;
                str = start+"->"+end ;
                if(start == end)
                    list.add(start+"") ;
                else 
                    list.add(str) ;
                start = nums[i+1] ;
            }
        }
        end = nums[nums.length-1] ;
        if(start == end)
            list.add(start+"") ;
        else
            list.add(start+"->"+nums[nums.length-1]) ;

        return list ;
    }
}