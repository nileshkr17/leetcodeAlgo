import java.util.Scanner;

class Solution{
    public void moveZeroes(int nums[])
    {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                int temp = nums[c];
                nums[c]=nums[i];
                nums[i]=temp;
                c++;

                
            }
            
        }
    }
   
}

/**
 * moveZero
 */
