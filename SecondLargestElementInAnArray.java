public class SecondLargestElementInAnArray {
    static int secondLargest(int a[]){
        int largest=a[0];
        int second=-Integer.MIN_VALUE;;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                
                second=largest;
                largest=a[i];

            }
            else if(a[i]>second && a[i]!=largest)
                second=a[i];
        }
        return second;

    }
    public static void main(String[] args) {

        int a[] = {10, 20, 5, 40, 15};

        int result = secondLargest(a);

        if (result == -1) {
            System.out.println("Second largest element does not exist");
        }
        else {
            System.out.println("Second largest element: " + result);
        }
    }
    
    
}
