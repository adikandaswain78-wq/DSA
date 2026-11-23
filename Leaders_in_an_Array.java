import java.util.ArrayList;
import java.util.List;

public class Leaders_in_an_Array {
    public List<Integer> leaders(int nums[]){
        int j=Integer.MIN_VALUE;
        List<Integer> a=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(j<nums[i]){
                a.add(nums[i]);
                j=nums[i];
            }

        }
        int r=a.size()-1;
        int l=0;
        while(l<r){
            int temp=a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);

            l++;
            r--;
        }
        return a;

    }
    public static void main(String[] args) {
    Leaders_in_an_Array obj = new Leaders_in_an_Array();
    int nums[] = {16,17,4,3,5,2};
    System.out.println(obj.leaders(nums));
}

    
}
