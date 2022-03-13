class Solution {
    
    void reverse(int arr[], int  low,int high )
    {
       int tmp;
        
        while(low<high)
        {
           tmp = arr[low];
            arr[low]=arr[high];
            arr[high]=tmp;
            low++;
            high--;
        }
        
    }
   
   public void rotate(int[] nums, int k) {
       
       int n = nums.length;
       if(n==1)
       return;
       
       k=k%n;
       
       reverse(nums, 0,n-k-1);
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-1);
       
       
   }
   
}