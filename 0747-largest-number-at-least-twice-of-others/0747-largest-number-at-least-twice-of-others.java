class Solution {

    public int dominantIndex(int[] nums) {

        int largest = nums[0];
        int index = 0;

        // Find largest number and its index
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > largest)
            {
                largest = nums[i];
                index = i;
            }
        }

        // Check twice condition
        for(int i=0; i<nums.length; i++)
        {
            if(i == index)
            {
                continue;
            }

            if(largest < 2 * nums[i])
            {
                return -1;
            }
        }

        return index;
    }
}