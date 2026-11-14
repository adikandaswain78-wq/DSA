public class lcm {
    static int lcmm(int a,int b){
        int max=Math.max(a,b);
        for(int i=max; ;i++){
            if(i%a==0 && i%b==0)
                return i;


        }

    }
     public static void main(String args[]) {
        int a = 12;
        int b = 18;

        System.out.println(lcmm(a, b));
}
}
