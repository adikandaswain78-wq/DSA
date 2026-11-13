public class reverseInteger {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            n/=10;
            if(rev>Integer.MAX_VALUE || rev==Integer.MAX_VALUE && digit > 7 )
                return 0;
            if(rev<Integer.MIN_VALUE || rev==Integer.MIN_VALUE && digit < -8)
                return 0;
            rev=(rev*10)+digit;
        }
        return rev;
    }
    public static void main(String args[]){
        int n = 1234;
    System.out.println("Reverse is: " + reverse(n));

    }
    
}
