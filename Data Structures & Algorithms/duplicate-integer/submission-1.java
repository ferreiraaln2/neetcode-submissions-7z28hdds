class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> list = new HashSet<>();
        for(Integer num : nums){
            if(!list.add(num)){
                return true;
            }
        }
        return false;
    }
}