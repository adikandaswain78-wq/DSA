class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[nums.length];
        int j=0;
        int k=n;
        for(int i=0;i<n;i++){
            a[j]=nums[i];
            j++;
            a[j]=nums[k];
            j++;k++;
        }
        return a;
        
    }
}