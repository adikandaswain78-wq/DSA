public class LargestElementInanArray {
    static int largestElement(int nums[]){
        int l=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l)
                l=nums[i];
        }
        return l;
    }
    public static void main(String[] args) {

        int nums[] = {10, 25, 5, 40, 15};

        System.out.println(largestElement(nums));
        
    }
}
