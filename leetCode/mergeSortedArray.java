class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for(int i =nums2.length -1; i >= 0; i--){
//             for(int j = 0; j < m + n; j++){

//                 if(nums1[j] > nums2[i]){
//                     int temp = nums1[j];
//                     nums1[j] = nums2[i];
//                     nums2[i] = nums1[j];
//                 }

//                 if(nums1[j] == 0){
//                     nums1[j] = nums2[i];
//                     i--;
//                 }
//             }
//         }
        // Arrays.sort(nums1);

        int i = 0;
        int j = 0;

        // [4  ,5,6,0,0,0]
        // [1,2,3]
        while (i < m && j < n) {
            int nums_i = nums1[i]; // 1 2 2 3
            int nums_j = nums2[j]; // 2 2 5 5
            System.out.println(nums_i);
            System.out.println(nums_j);

            if (nums_i < nums_j) { //
                i++;
            } else {
                // perform our swap
                nums1[i] = nums_j;
                nums2[j] = nums_i;
                if (nums_j == 0) {
                    j++;
                } else {
                    i++;
                }
            }

        }

        // loop and add remaining ints
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}