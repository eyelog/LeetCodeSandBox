package TwoSums

import java.util.*

/*
* Given an array of integers nums and an integer target,
*  return indices of the two numbers such that they add up to target.
* Example :
*    Input: nums = [2,7,11,15], target = 9
*    Output: [0,1]
*    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*
* */


fun main() {

    println(getIndexes(intArrayOf(2, 7, 11, 15), 18).contentToString())
}

private fun getIndexes(nums: IntArray, target: Int): IntArray{

    val outArray = IntArray(2)

    val map = hashMapOf<Int, Int>()

    nums.forEachIndexed { index, i ->
        if (map.containsKey(target - i)){
            outArray[1] = index
            outArray[0] = map[target - i] ?: 0
            return outArray
        }
        map[i] = index
    }

    return outArray
}