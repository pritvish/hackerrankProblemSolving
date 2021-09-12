package leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int temp = 0;

        if (nums1.length!=0 && nums1.length != 0) {
            for (int i=0; i<nums1.length; i++) {
                while (nums1[i]!=0) {
                    if (nums1[i] > nums2[0]) {
                        temp = nums1[i];
                        nums1[i] = nums2[0];
                        nums2[0] = temp;
                        Arrays.sort(nums2);
                    }
                    i++;
                }
                int j = 0;
                while (j < nums2.length) {
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                }
            }
        } else if(nums1.length == 0) {
            nums1 = nums2;
        } else {
            nums2 = nums1;
        }


        for (int i:nums1) {
            System.out.print(i+" ");
        }
    }
}
