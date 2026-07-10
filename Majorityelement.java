class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();

        for(int n : nums) {
            ans.put(n,ans.getOrDefault(n,0)+1);
            if(ans.get(n)>nums.length/2)
            return n;
        }

        return -1;
    }
}
/*
firstly will check the numbers are there are not one by one 
next if its not there will get the count and add 1 to it 
to get the max number
will find the length of the actual array by dividing 
later if ans number is greater than the number in nums thats the actual output..
though we are returning the early 
we are giving -1 as return ...
*/
