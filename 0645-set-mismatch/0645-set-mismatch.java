class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
       int duplicate=removeDuplicate(nums);
        int missing = missingNumber(nums,duplicate);
         return new int[]{duplicate, missing};
       
               }        
    
    static int removeDuplicate(int nums[]){
         for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1])
                return nums[i];
        }
        return -1;
    }
    
    static int missingNumber(int nums[],int duplicate ){
        int n=nums.length;
        int total_sum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return total_sum-(sum - duplicate);
    }
}