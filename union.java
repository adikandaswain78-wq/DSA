import java.util.Arrays;
public class union {

    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int c[] = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (k == 0 || c[k - 1] != nums1[i])
                    c[k++] = nums1[i];
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                if (k == 0 || c[k - 1] != nums2[j])
                    c[k++] = nums2[j];
                j++;
            }
            else {
                if (k == 0 || c[k - 1] != nums1[i])
                    c[k++] = nums1[i];
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            if (k == 0 || c[k - 1] != nums1[i])
                c[k++] = nums1[i];
            i++;
        }
        while (j < nums2.length) {
            if (k == 0 || c[k - 1] != nums2[j])
                c[k++] = nums2[j];
            j++;
        }
        return Arrays.copyOf(c, k);
    }
    public static void main(String[] args) {
        union obj = new union();
        int nums1[]={1,2,2,3,4};
        int nums2[]={2,3,4,4,5,6};
        int result[]=obj.unionArray(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
