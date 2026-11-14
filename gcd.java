public class gcd {
    static int gcd(int a, int b) {
        int g = 1;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                g = i;
            }
        }

        return g;
    }

    public static void main(String args[]) {
        int a = 12;
        int b = 18;

        System.out.println(gcd(a, b));
    }
}
