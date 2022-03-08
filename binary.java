/*Constraints:
1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.
*/

class Solution {
    public int search(int[] nums, int target) {
        int end= nums.length-1;    
        int mid=0, start=0;
        
        while(start<=end)
        {
            mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            if(target>nums[mid])
                start = mid+1;
            else
            if(target<nums[mid])
                end=mid-1;
        }
        return -1;       
    }
}