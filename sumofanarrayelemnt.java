public class sumofanarrayelemnt {
    static int sum(int a[],int n){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];

        }
        return s;
    }
    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50};

        System.out.println(sum(a, a.length));
    }

}
