package practiceCodes

import java.util.*

fun twoSum(nums: Array<Int>, target: Int) : IntArray{
    for (i in 0 until nums.size - 1) {
        for (k in i + 1 until nums.size) {
            val ans = nums[i] + nums[k]
            if (ans == target) {
                return intArrayOf(i,k)
            }
        }
    }
    return intArrayOf(-1,-1)
}

fun DuplicatesSorttedAray(nums : IntArray) : Int{
    var i = 0
    var count = 1
    for(j in 1 until nums.size){
        if(nums[i] != nums[j]){
            swap(nums,i+1,j)
            i++
            count++
        }
    }
    println(Arrays.toString(nums))
    return count
}
fun swap(nums : IntArray, f : Int, s : Int){
    var temp = nums[f]
    nums[f] = nums[s]
    nums[s] = temp
}


fun SearchTargetPosition(nums : IntArray, target : Int): Int{
    var s = 0
    var e = nums.size

    while(s < e){
        var mid = (s+e)/2
        if(nums[mid] == target){
            return mid
        }
    }
    return s
}

fun plusOne(nums: IntArray): IntArray {
    //Here it will add 1 only with the end number and for every remaining digits the value of carry will be 0
    val result = mutableListOf<Int>()
    var carry = 1 // Start with the initial carry, representing the "plus one"

    // Traverse the array from the last digit
    for (i in nums.size - 1 downTo 0) {
        val sum = nums[i] + carry
        result.add(sum % 10) // Add the current digit after mod operation
        carry = sum / 10     // Update the carry (it will be 1 or 0)
    }

    // If there's a carry left after the loop, prepend it to the result
    if (carry > 0) {
        result.add(carry)
    }

    // Reverse the list to restore correct order and convert to IntArray
    return result.reversed().toIntArray()
}



fun main() {
//    countDigits()
//    countDigits2()
//    cubeEach()
//    println(checkPrimeUsingBreak())
//    println(checkPrime())
//    val arr = arrayOf(1,1,1,2,2,7,11,15)
//    println(Arrays.toString(twoSum(arr,22)))
//    val arr2 =  intArrayOf(1,1,2)
//    println(DuplicatesSorttedAray(arr2))
//    println(SearchTargetPosition(arr2,3))
    val arr = intArrayOf(9,8,7,6,5,4,3,2,1,0)
    println(plusOne(arr))
}
