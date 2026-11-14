public class countofoddnumberinanarray {
    static int odd(int a[],int n){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
                count++;
        }
        return count;

    }
     public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 7};

         System.out.println(odd(a, a.length));
}
}
