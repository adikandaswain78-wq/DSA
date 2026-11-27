class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<> ();

       
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<> ();
            long ans=1;
            row.add(1);
            for(int j=1;j<=i;j++){
                ans*=(i-j+1);
                ans/=j;
                row.add((int)ans);
            }
            res.add(row);




        }
        return res;
        
    }
}