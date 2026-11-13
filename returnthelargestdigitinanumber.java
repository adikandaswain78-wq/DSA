public class returnthelargestdigitinanumber {
    static int largestDigit(int n){
        int largest=0;
        while(n!=0){
            int digit=n%10;
            if(largest<digit)
                largest=digit;
            n/=10;

        }
        return largest;
    }
     public static void main(String args[]) {
        int n = 58329;
        System.out.println(largestDigit(n));
    }
    
}
