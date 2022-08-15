class Solution {
    public int searchInsert(int[] nums, int target) {
//         declare a counter to keep track of the index
//         count should not reach the end of the arr
//         use a while loop to traverse arr
//         increment counter if preceding element is smaller than given element
//         return count if given element is = to element at index
//         return count if given element is less than preceding elem and greater than
// previous element

//         int count = 0;

//         if(target <= nums[count]){
//             return count;
//         } else {
//             count++;
//         }

//         while(count <= nums.length -1){

//             if(target == nums[count]){
//                 return count;
//             } else if(target > nums[nums.length -1]){
//                 return nums.length;
//             } else if(nums[count -1] < target && target < nums[count]){
//                 return count;
//             } else {
//                 count++;
//             }
//         }

//         return count;

//         second way
//         binary search - find the mid point of the array then create a left and right pointer
//         compare the target with the mid point. If (tar > mid) then left = mid + 1
//         else right = mid - 1
//         do this until target = mid
//         if target is not found and right < left then return left

        int pL = 0; // 3
        int pR = nums.length -1; // 3


        while(pR >= pL){
            int mid = pL + (pR - pL) / 2; // updating mid inside while loop

            if(target == nums[mid]){ // 5
                return mid;
            }

            if(target > nums[mid]){ // 5 > 3
                pL = mid + 1;
            } else if(target < nums[mid]) {
                pR = mid - 1;
            }

        }
        return pL;
    }
}