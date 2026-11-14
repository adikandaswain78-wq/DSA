public class divisorsofanumber {
    static int divisor(int n) {
        int d = 1;

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                d = i;
            }
        }

        return d;
    }

    public static void main(String args[]) {
        int n = 12;
        System.out.println(divisor(n));
    }
}
