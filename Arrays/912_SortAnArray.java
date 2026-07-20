class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1) ;
        return nums ;
    } 

public static void mergeSort(int [] arr, int low, int high)
	{
		if(low < high)
		{
			int mid = low+(high-low)/2 ;
			mergeSort(arr, low, mid) ;
			mergeSort(arr, mid+1, high) ;
			merge(arr, low, mid, high) ;
		}
	}

	public static void merge(int [] arr, int left, int mid, int right)
	{
		int leftLen = mid-left+1 ;
		int rightLen = right-mid ;
		int [] larr = new int[leftLen] ;
		int [] rarr = new int[rightLen] ;

		for(int i = 0; i < leftLen; i++)
			larr[i] = arr[left+i] ;

		for(int i = 0; i < rightLen ; i++)
			rarr[i] = arr[mid+1+i] ;

		int i = 0, j = 0, k = left ;
		while(i < leftLen && j < rightLen)
		{
			if(larr[i] < rarr[j])
				arr[k++] = larr[i++] ;
			else
				arr[k++] = rarr[j++] ;
		}

		while(i < leftLen)
			arr[k++] = larr[i++] ;

		while(j < rightLen)
			arr[k++] = rarr[j++] ;
	}
}
    