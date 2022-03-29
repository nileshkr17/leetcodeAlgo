class Solution {
    public int findDuplicate(int[] nums) {
        int flag=0,i,j;
        int n=nums.length;
        Arrays.sort(nums);
         for(i = 0; i <n-1 ; i++)
        {
            if(nums[i] == nums[i+1])
            {
                flag = nums[i];
                break;
            }
        }
        
        return flag;
        
      
    }
}

