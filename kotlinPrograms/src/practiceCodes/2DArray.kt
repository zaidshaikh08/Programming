package practiceCodes

//1.Transpose of an Array
fun Transpose(matrix : Array<IntArray>) : Array<IntArray>{
    val rows = matrix.size
    val cols = matrix[0].size

    var result = Array(cols) {IntArray(rows)}
    for(i in 0 until cols){
        for(j in 0 until rows){
            result[i][j] = matrix[j][i]
        }
    }
    return result
}

//fun main(){
//    val arr = arrayOf(
//        intArrayOf(1,2,3,4),
//        intArrayOf(5,6,7,8),
//        intArrayOf(9,10,11,12)
//    )
//    println(Transpose(arr).contentDeepToString())
//}

//2.Add two matrix and this addition should be performed on the 2nd matrix. Return second matrix
fun AddingMatrix(n1 : Array<IntArray>, n2 : Array<IntArray>) : Array<IntArray>{
    var rows = n1.size
    var cols = n1[0].size
    for(i in 0 until rows){
        for(j in 0 until cols){
            n2[i][j] = n1[i][j] + n2[i][j]
        }
    }
    return n2
}
//fun main(){
//    val arr1 = arrayOf(
//        intArrayOf(1,2,3,4),
//        intArrayOf(5,6,7,8),
//        intArrayOf(9,10,11,12)
//    )
//    val arr2 = arrayOf(
//        intArrayOf(1,2,3,4),
//        intArrayOf(5,6,7,8),
//        intArrayOf(9,10,11,12)
//    )
//    println(AddingMatrix(arr1,arr2).contentDeepToString())
//}

//3. Access and Add Diagonal Element
fun AddDiagonalElement(matrix : Array<IntArray>) : String{
    var i = 0
    var j = 0

    var sum = 0
    while(i < matrix.size && j < matrix[0].size){
        sum += matrix[i][j]
        i++
        j++
    }
    return ("Sum of Diagonal Elements is : $sum")
}
//fun main(){
//    val arr2 = arrayOf(
//        intArrayOf(1,2,3,4),
//        intArrayOf(5,6,7,8),
//        intArrayOf(9,10,11,12)
//    )
//    println(AddDiagonalElement(arr2))
//}

fun spiralOrderMatrix(n: Array<IntArray>): List<Int> {
    var rowStart = 0
    var colStart = 0  // Renamed colStrt to colStart
    var rowEnd = n.size - 1
    var colEnd = n[0].size - 1
    val result = mutableListOf<Int>()

    while (rowStart <= rowEnd && colStart <= colEnd) {
        // Traverse from left to right
        for (i in colStart..colEnd) {
            result.add(n[rowStart][i])
        }
        rowStart++

        // Traverse from top to bottom
        for (i in rowStart..rowEnd) {
            result.add(n[i][colEnd])
        }
        colEnd--

        // Traverse from right to left (Only if rowStart is still within bounds)
//        if (rowStart <= rowEnd) {
            for (i in colEnd downTo colStart) {
                result.add(n[rowEnd][i])
            }
            rowEnd--
//        }

        // Traverse from bottom to top (Only if colStart is still within bounds)
//        if (colStart <= colEnd) {
            for (i in rowEnd downTo rowStart) {
                result.add(n[i][colStart])
            }
            colStart++
//        }
    }
    return result
}

//fun main() {
//    val num = arrayOf(
//        intArrayOf(1, 2, 3, 4),
//        intArrayOf(5, 6, 7, 8),
//        intArrayOf(9, 10, 11, 12),
//        intArrayOf(19, 110, 111, 112)
//    )
//    println(spiralOrderMatrix(num))
//}

fun SearchingMatrix(n : Array<IntArray>, target : Int) : IntArray{
    for(i in 0..n.size-1){
        for(j in 0..n[0].size-1){
            if(n[i][j] == target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf(-1,-1)
}
fun main() {
    val num = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(19, 110, 111, 112)
    )
    println(SearchingMatrix(num,110).contentToString())
}
