//package tutorialCodes
//fun main(){
//    //Initialization
//    var num = arrayOf(
//        arrayOf(1,2,3),
//        arrayOf(4,5,6),
//        arrayOf(7,8,9)
//    )
//    //print array elements. We can also loop through to get each elements
//    println(num.contentDeepToString())
//
//    //Initialization of primitive arrays
//    var number = arrayOf(
//        intArrayOf(12,3,4),
//        intArrayOf(2,3,6),
//        intArrayOf(56,77,89)
//    )
//
//    //Initialization of Array with default values
//    var numbers = Array(4) {Array(4) {2} }
//    println(numbers.contentDeepToString())
//
//    //Making of new array and copying elements of an array
//    var arr1 = num.copyOf()
//    println(arr1.contentDeepToString())
//
//    //Modifying element of array
//    arr1[0][2] = 111
//    println(arr1.contentDeepToString())
//
//    //Looping through an array
//    var arr2 = arr1.copyOf()
//    for(i in 0 until arr2.size){//getting number of rows
//        for(j in 0 until arr2[i].size){//getting number of cols
//            print("${arr2[i][j]} ")
//        }
//        println()
//    }
//
//}

//Problem Solving : Sum of rows
fun SumRows(arr : Array<Array<Int>>): IntArray{
    var list = mutableListOf<Int>()
    for(i in 0 until arr.size){
        var sum = 0
        for(j in 0 until arr[i].size){
            sum = sum + arr[i][j]
        }
        list.add(sum)
    }
    return list.toIntArray()
}

fun transposeMatrix(arr : Array<Array<Int>>) : Array<IntArray>{
    var row = arr.size // pointer that will note the index wont go out of bounds
    var col = arr[0].size

    var newArr = Array(row) {IntArray(col)}

    for(i in 0 until row){ //as we're creating a transpose
        for(j in 0 until col){
            newArr[i][j] = arr[j][i]
        }
    }
    return newArr
}
fun main(){
    var arr = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )
    println(SumRows(arr).contentToString())
    println(transposeMatrix(arr).contentDeepToString())
}
