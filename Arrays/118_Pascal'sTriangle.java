class Solution {
    public List<List<Integer>> generate(int numRows) {
        int [][] a = new int[numRows][] ;
        for(int i = 1; i <= numRows ; i++)
            a[i-1] = new int[i] ;

        for(int i = 0 ; i < a.length ; i++)
            for(int j = 0 ; j < a[i].length ; j++)
                a[i][j] = 1 ;

        for(int i = 1; i < numRows-1 ; i++)
            for(int j = 0 ; j < a[i].length-1 ; j++)
                a[i+1][j+1] = a[i][j] + a[i][j+1] ;

        List<List<Integer>> list = new ArrayList<>() ;
        for(int [] arr : a)
        {
            List<Integer> list1 = new ArrayList<>() ;
            for(int ele : arr)  
                list1.add(ele) ;
            
            list.add(list1) ;
        }
        return list ;
    }
}