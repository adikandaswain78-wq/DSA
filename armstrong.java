public class armstrong {
    static boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        int digits=0;
        while(n!=0){
            digits++;
            n/=10;

        }
        int temp=org;
        while(temp!=0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp/=10;


        }
        return sum==org;

    }
    public static void main(String args[]) {
        int n = 153;

        if(isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
    
}
