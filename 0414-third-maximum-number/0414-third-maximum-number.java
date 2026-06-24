class Solution {

    public int thirdMax(int[] nums) {

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for(int num : nums)
        {

            // Ignore duplicates
            if((first != null && num == first) ||
               (second != null && num == second) ||
               (third != null && num == third))
            {
                continue;
            }

            // New largest number
            if(first == null || num > first)
            {
                third = second;
                second = first;
                first = num;
            }

            // New second largest
            else if(second == null || num > second)
            {
                third = second;
                second = num;
            }

            // New third largest
            else if(third == null || num > third)
            {
                third = num;
            }
        }

        if(third == null)
        {
            return first;
        }

        return third;
    }
}