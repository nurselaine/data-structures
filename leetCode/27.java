class Solution {
    public int removeElement(int[] nums, int val) {
        // sort through an array given a number
        // remove the given val
        // all values left in array should be at the front
        // the rest of the values should be ''
        int count = nums.length;

        // loop through the sorted arr
        for(int i = 0; i < nums.length; i++){
            int c = 0;
            // replace all instances of val
            if(nums[i] == val){
                nums[i] = 0;
                c++;
            }
            count = count - c;
        }
        System.out.println(count);
        // sort arr
        sort(nums, val);
        return count;
    }

    public static int[] sort(int[] nums, int val){
        // sort through array to move all instances of val to the end
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    swap(nums, i, j);
                }
            }
            System.out.print(nums[i]);
        }
        return nums;
    }

    public static void swap(int[] nums, int indexI, int indexJ){
        int temp = nums[indexI];
        nums[indexI] = nums[indexJ];
        nums[indexJ] = temp;
    }
}

/*
    faster option
*/

    public int removeElement(int[] num, int val){

        // set a counter to return
        int count = 0;

        // traverse through nums
        for(int i = 0; i < num.length; i++){
            // if num[index] is not val then increase count
            if(num[i] != val){
                // correct val will be reassign to nums[count]
                num[count++] = num[i];
            }
        }

        return count;
    }