package `Search Insert Position`

fun main() {
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size-1
    var mid = 0
    var result = 0
    while (left<=right){
        mid = (left+right)/2
        if (nums[mid]==target) return mid
        else{
            if (target<nums[mid]){
                result=mid
                right=mid-1
            }else{
                result = mid+1
                left = mid+1
            }
        }
    }
    return result
}