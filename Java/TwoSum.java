class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numLoc=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(numLoc.containsKey(target-nums[i])){
                return new int[] {numLoc.get(target-nums[i]),i};
            }else{
                numLoc.put(nums[i],i);
            }
        }
        return new int[] {0,0};
    }
}
