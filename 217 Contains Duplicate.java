class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> Duplicate= new HashSet<>();
      for(int i=0;i<nums.length;i++){
        Duplicate.add(nums[i]);
      }
      int size=Duplicate.size();
      int length=nums.length;
      if(size==length){
        return false;
      }else{
        return true;
      }
    }
}