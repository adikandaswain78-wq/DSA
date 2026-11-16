import java.util.*;


public class highest_Occurring_Element_in_an_Array {

    public int mostFrequentElement(int[] num) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i:num)
            map.put(i,map.getOrDefault(num,0)+1);

        int maxfreq=0;
        int ans=0;
        for(int key:map.keySet()){
            int freq=map.get(key);

            if(freq>maxfreq || freq==maxfreq && key < ans){
                maxfreq=freq;
                ans=key;
            }

        }
        return ans;
    }
     public static void main(String[] args) {

        highest_Occurring_Element_in_an_Array obj =
                new highest_Occurring_Element_in_an_Array();

        int[] nums = {4, 4, 4, 2, 2, 2, 5};

        System.out.println(obj.mostFrequentElement(nums));
    }
    
}
