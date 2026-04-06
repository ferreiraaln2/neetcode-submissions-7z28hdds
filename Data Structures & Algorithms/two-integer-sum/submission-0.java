class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> list =  new HashMap<>();
        int[] result = {};

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(list.containsKey(diff)){
                result = new int[]{list.get(diff), i};
            }else{
                list.put(nums[i], i);
            }
        }

        return result;
    }
}
