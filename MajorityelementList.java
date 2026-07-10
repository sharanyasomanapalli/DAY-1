class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int n : nums) {
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(int k : ans.keySet()) {
            if(ans.get(k)>nums.length/3) {
                l.add(k);
            }
        }
        return l;
    }
}
