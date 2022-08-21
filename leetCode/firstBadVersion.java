/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
//         First solution: Iterating from 1 to n (linear scan)

        // int point = 1;
        // while(point <= n){
        //     if(isBadVersion(point)){
        //         return point;
        //     }
        //     point++;
        // }
        // return point;
//         this solution is very slow and works but takes too long
//         time complexity o(n) and space complexity is o(1)

//         Second Solution: Use binary search
//         make three pointers to rep left, right and mid
//         use a while loop that goes until the right pointer is < the left pointer
//         mid should be updated inside loop
//         doing this cuts the search time down by halfing the search at the beginning

        int left = 1; // 2
        int right = n; // 3

        while (left <= right){
            int mid = left + (right - left) / 2; // 1


            if(isBadVersion(mid)){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
        // time complexity is o(logn)
        // space complexity is o(1)
    }
}