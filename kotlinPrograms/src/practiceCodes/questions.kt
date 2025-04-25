package practiceCodes.practiceCodes

import java.util.*

//WAP to take a number from User and count the digit.
fun countDigits(){
    print("Enter the number to count digits : ")
    var inputNum = readln().toInt()
    var temp = inputNum.toString()
    val ans = temp.length
    println(ans)
    //Here i've converted the input into string and then counted the digits by using the method .length of string class
}

fun countDigits2(){//Complex method
    print("Enter the number to count digits : ")
    var inputNum = readln().toInt()
    var count = 0
    while(inputNum > 0){
        inputNum /= 10
        count++
    }
    println(count)
}

//WAP to take number from user and find the sum of cube of each digit of number
fun cubeEach(){
    print("Enter the number : ")
    var n = readln().toInt()
    var ans = 0
    while(n > 0){
        var temp = n % 10
        ans += Math.pow(temp.toDouble(),3.0).toInt()
        n/=10
    }
    println(ans)
}

//WAP to take number from user and check prime number
fun checkPrimeUsingBreak() : Boolean{//beginners method
    var n = readln().toInt()
    var isPrime = true
    for(i in 2 until n){
        if(n % i == 0){
            isPrime = false
            break
        }
    }
    if(isPrime){
        return true
    }
    return false
}

fun checkPrime() : Boolean{
    var n = readln().toInt()
    for(i in 2 until n){
        if(n % i == 0){
            return false
        }
    }
    return true
}

fun checkPrime2() : Boolean{
    val n = readln().toInt()
    if(n <= 1){//because 1 is neither prime nor composite
        return false
    }
    for(i in 2..Math.sqrt(n.toDouble()).toInt()){
        if(n % i == 0){
            return false
        }
    }
    return true
}

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

fun main() {
//    countDigits()
//    countDigits2()
//    cubeEach()
//    println(checkPrimeUsingBreak())
//    println(checkPrime())
    val arr = arrayOf(1,1,1,2,2,7,11,15)
    println(Arrays.toString(twoSum(arr,22)))
    val arr2 =  intArrayOf(1,1,2)
    println(DuplicatesSorttedAray(arr2))
}