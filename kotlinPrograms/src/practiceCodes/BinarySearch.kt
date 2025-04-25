package practiceCodes
fun binarySearch(n : IntArray, target : Int): IntArray{
    var s = 0
    var e = n.size-1

    while(s <= e){
        var mid = (s+e)/2

        if(n[mid] == target){
            return intArrayOf(mid)
        }else if(n[mid] < target){
            s = mid+1
        }else{
            e = mid - 1
        }
    }
    return intArrayOf(-1)
}
//fun main(){
//    val nums = intArrayOf(12,44,55,66,88,100)
//    println(binarySearch(nums,100).contentToString())
//}

fun ceilingNumber(n : IntArray, target: Int) : IntArray{
    var s = 0
    var e = n.size-1

    while(s <= e){
        var mid = (s+e)/2

        if(n[mid] == target){
            return intArrayOf(mid)

        }else if(n[mid] < target){
            s = mid+1

        }else{
            e = mid - 1
        }
    }
    return intArrayOf(s)
}
//fun main(){
//    val nums = intArrayOf(12,44,55,66,88,100)
//    println(ceilingNumber(nums,67).contentToString())
//}

fun findOccurrence(n : IntArray, target: Int, fOcc : Boolean) : IntArray{
    //FirstOccurrence
    var s = 0
    var e = n.size-1

    while(s <= e){
        var mid = (s+e)/2

        if(n[mid] == target){
            if(fOcc == true) {
                while (mid > 0 && n[mid] == n[mid - 1]) {
                    mid = mid - 1
                }
                return intArrayOf(mid)
            }else{
                while (mid < n.size-1 && n[mid] == n[mid + 1]) {
                    mid = mid + 1
                }
                return intArrayOf(mid)
            }

        }else if(n[mid] < target){
            s = mid+1

        }else{
            e = mid - 1
        }

    }
    return intArrayOf(-1)
}

//fun main(){
//    val nums = intArrayOf(12,12,12,44,55,56,66,66,88,100)
//    println(findOccurrence(nums,12,true).contentToString())
//}

fun searchInMountain(n: IntArray): Int {
    var s = 0
    var e = n.size - 1

    while (s < e) {
        val mid = (s + e) / 2
        if (n[mid] < n[mid + 1]) {
            s = mid + 1 // Move right as we're ascending
        } else {
            e = mid // Move left as we're descending
        }
    }
    return s // Or `e`, as both converge to the peak
}
fun BinarySearch(n : IntArray, target : Int, s : Int, e : Int): Int{
    var s = 0
    var e = n.size-1

    while(s <= e){
        var mid = (s+e)/2

        if(n[mid] == target){
            return mid
        }else if(n[mid] < target){
            s = mid+1
        }else{
            e = mid - 1
        }
    }
    return -1
}
fun searchingHalf(nums : IntArray,target : Int, s : Int, e : Int) : Int{
    val peak = searchInMountain(nums)
    var result = BinarySearch(nums, target,0,peak)
    if(result == -1){
        return BinarySearch(nums,target,peak,nums.size)
    }
    return result
}

//fun main(){
//    var nums = intArrayOf(1,2,4,5,6,2)
//    println(searchingHalf(nums,2,0,nums.size))
//}

fun rotatedArraySearchPivot(num : IntArray): Int{
    var s = 0
    var e = num.size-1

    while(s < e){
        var mid = (s + e) / 2
        if(num[s] < num[mid]){
            s = mid
        }else{
            e = mid
        }
    }
    return s
}
fun rotatedBinarySearch(num : IntArray, target : Int, s : Int, e : Int) : Int{
    var temp1 = s
    var temp2 = e
        while(temp1 <= temp2){
            var mid = (temp1 + temp2) / 2
            if(num[mid] == target){
                return mid
            }else if(num[mid] < target){
                temp1 = mid + 1
            }else{
                temp2 = mid - 1
            }
        }
    return -1
}

fun finalImplementation(num : IntArray, target: Int) : Int{
    if(num[0] < num[num.size-1]){
        return rotatedBinarySearch(num,target,0,num.size-1)
    }

    var pivot = rotatedArraySearchPivot(num)//i found the largest element
    var result = rotatedBinarySearch(num,target,0,pivot)

    if(result == -1){
        return rotatedBinarySearch(num,target,pivot,num.size-1)
    }
    return result
}
fun main(){
    var num = intArrayOf(1,2,3,4,5,6)
   println(finalImplementation(num,6))
}