package practiceCodes
//fun factorial(){
//    var n = 5
//    var sum = 1
//    for(i in n downTo 1){
//        sum = sum * i
//    }
//    println(sum)
//}
//
//fun SumOfN(){
//    val n = 10
//    var ans = 0
//    for(i in 1..n){
//        ans+=i
//    }
//    println(ans)
//}
//
//fun ReverseNum(){
//    var n = 123
//    var ans = 0
//    while(n > 0){
//        var temp = n % 10
//        ans = (ans*10) + (temp)
//        n/=10
//    }
//    println(ans)
//}

//fun PallindromeOrNot(n : Int) : Boolean{
//    var ans = 0
//    var tempN = n
//    while(tempN > 0){
//        var temp = tempN % 10
//        ans = (ans*10) + (temp)
//        tempN/=10
//    }
//    if(n == ans){
//        return true
//    }
//    return false
//}

//fun SumOfDigits(){
//    var tempN = 123
//    var ans = 0
//
//    while(tempN > 0){
//        var temp = tempN % 10
//        ans += temp
//        tempN/=10
//    }
//}

//import kotlin.math.*
//During reversing the number square each of the digit. After reversing your each number is reversed with squared values. Again reverse the number
//fun main(){
//    println(ArmstrongNum(123))
//}
//fun ArmstrongNum(n : Int):Boolean{
//    var ans = 0
//    var count = 0
//
//    var tempN = n
//    while(tempN>0){//loop that will count number of digits
//        tempN/=10
//        count++
//    }
//
//    var tempN2 = n
//    while(tempN2 > 0){
//        var temp = tempN2 % 10
//        ans += Math.pow(temp.toDouble(),count.toDouble()).toInt()
//        tempN2 /= 10
//    }
//
//    //If armstrong so return true else return false
//    if(n == ans){
//        return true
//    }
//    return false
//}

//fun ReverseStr(str : String) : String{
//    var temp = str
//    var ans = ""
//
//    while(temp.isNotEmpty()){
//        ans = temp[0] + ans
//        temp = temp.substring(1)
//    }
//    return ans
//}
//
//fun PerfectNum(n : Int) : Boolean{
//    var ans = 0
//
//    var i = 1
//    while(i < n){
//        if(n % i == 0){
//            ans += i
//            i++
//        }else{
//            i++
//        }
//    }
//    if(n == ans){
//        return true
//    }
//    return false
//}
//
//fun countDays(){
//    val days = 31
//    var count = 0
//    for(i in 1..days){
//        if(i % 2 == 0){
//            count++
//        }
//    }
//    println(count)
//
//    //Solution for above problem in lambda expression
//    var countDays : (Int) -> Int = {days->
//        var count = 0
//        for(i in 1..days){
//            if(i % 2 == 0){
//                count++;
//            }
//        }
//        count
//    }
//    println(countDays(31))
//}
//
//
////Lambda Functions/Expressions
//fun LambdaExpression(){
//    var findFact : (Int) -> Int = {n ->
//        var ans = 1
//        for(i in n downTo 1){
//            ans *= i
//        }
//        ans
//    }
//    println(findFact(5))
//
//    var sumOfN : (Int) -> Int = {n ->
//        var ans = 0
//        for(i in n downTo 1){
//            ans += i
//        }
//        ans
//    }
//    println(sumOfN(5))
//
//    var RevNum : (Int) -> Int = {n ->
//        var num = n
//        var ans = 0
//        while(num > 0){
//            var temp = num % 10
//            ans = (ans*10) + temp
//            num = num / 10
//        }
//        ans
//    }
//    println(RevNum(123))
//
//    var PallindromeCheck : (Int) -> Boolean = {n ->
//        var temp = n
//        var ans = 0
//        while(temp > 0){
//            var temp2 = temp % 10
//            ans = (ans*10) + temp2
//            temp/=10
//        }
//        println(ans)
//        if(ans == n){
//            true
//        }else{
//            false
//        }
//
//    }
//    println("The given number is pallindrome : ${PallindromeCheck(1211)}")//Calling lambda expression as a string template
//
//
//    var sumOfDigits :  (Int) -> Int = {n ->
//        var temp = n
//        var ans = 0
//        while(temp > 0){
//            var temp2 = temp % 10
//            ans += temp2
//            temp /= 10
//        }
//        ans
//    }
//    println("The sum of Digits of the given number : ${sumOfDigits(123)}")
//
//    var revStr : (String) -> String = {str ->
//        var temp = str
//        var ans = ""
//        while(temp.isNotEmpty()){
//            var ch = temp[0]
//            ans = ch + ans
//            temp = temp.substring(1)
//        }
//        ans
//    }
//    println("The reverse of the given string is : ${revStr("abc")}")
//}
//
//fun main(){
//    LambdaExpression()
//}

//10-03-2025
fun printTable(){//from 1 to n using nested loops
    var n = 10
    for(i in 1..10){
        for(j in 1..10){
            println("$i * $j = ${i*j}")
        }
        println()
    }
}

fun square(n : Int){
    for(stars in 1..n){
        for(i in 1..n){
            print("* ")
        }
        println()
    }
}

fun rightAngle(n : Int){
    var i = 1
    for(stars in 1..n){
        for (j in 1..i){
            print("* ")
        }
        println()
        i++
    }
}

fun invertRightAngle(n : Int){
    var i = 1
    for(stars in 1..n){
        for(j in n downTo i){
            print("* ")
        }
        println()
        i++
    }
}

fun rightAngleNumTri(n : Int){
    var i = 1
    for(numbers in 1..n){
        var numInTri = 1 //numbers that are printed in triangle is via this variable
        for(j in 1..i){
            print(numInTri)
            numInTri++
        }
        println()
        i++
    }
}

fun OppHypo(n : Int){
    var temp = n
    var count = 1
    for(starts in 1..n){
        for(i in 1 until temp){
            print(" ")
        }
        for(j in 1..count){
            print("*")
        }
        println()
        count++
        temp--
    }
}

//Tilted pyramid : The problem will be solved by making 2 pyramids
fun upperPyramid(n : Int){
    var count = 1
    for(stars in 1 until n){
        for(i in 1..count){
            print("* ")
        }
        println()
        count++
    }
}
fun lowerPyramid(n : Int){
    var temp = n
    for(stars in 1..n){
        for(i in temp downTo 1){
            print("* ")
        }
        println()
        temp--
    }
}
fun pyramid(n : Int){
    upperPyramid(n)
    lowerPyramid(n)
}


fun OppInvertHypo(n : Int){
    var count = 1
    var temp = n
    for(stars in 1..n){
        if(stars == 1){
            for (j in temp downTo 1){
                print("* ")
            }
            println()
            temp--
        }else{
            for(i in 1..count){
                print("  ")
            }
            for(j in temp downTo 1){
                print("* ")
            }
            println()
            count++
            temp--
        }
    }
}

fun triangle(n : Int){
    var temp = n
    var count = 1
    for(stars in 1..n){
            for(stars in temp downTo 1){
                print("  ")
            }
            for(i in 1..count){
                print("* ")
            }
            println()
            count+=2
            temp--
    }
}

fun InvertedTri(n : Int){
    var temp = (n-1) * 2 + 1
    var count = 1

    for(stars in 1..n){
        for(i in count downTo 1){
            print("  ")
        }
        for(j in 1..temp){
            print("* ")
        }
        println()
        count++
        temp-=2
    }
}

fun normalTri(n : Int){//
    var temp = n
    var count = 1
    for(stars in 1..n){
        for(stars in temp downTo 1){
            print(" ")
        }
        for(i in 1..count){
            print("* ")
        }
        println()
        count++
        temp--
    }
}

fun InvertedNormalTri(n:Int){
    var temp = n
    var count = 1
    for(stars in 1..n){
        for(i in 1..count){
            print(" ")
        }
        for(j in temp downTo 1){
            print("* ")
        }
        println()
        count++
        temp--
    }

}

fun sandClockPart1(n:Int){
    var temp = n
    var count = 1
    for(stars in 1..n){
        for(i in 1..count){
            print(" ")
        }
        for(j in temp downTo 1){
            print("* ")
        }
        println()
        count++
        temp--
    }
}

fun sandClockPart2(n : Int){//
    var temp = n
    var count = 1
    for(stars in 1..n){
        for(stars in temp downTo 1){
            print(" ")
        }
        for(i in 1..count){
            print("* ")
        }
        println()
        count++
        temp--
    }
}
fun sandClock(n:Int){
    sandClockPart1(4)
    sandClockPart2(4)
}
fun main(){
    printTable()
    square(4)
    rightAngle(4)
    invertRightAngle(4)
    rightAngleNumTri(4)
    OppHypo(4)
    pyramid(4)
    OppInvertHypo(4)
    triangle(4)
    InvertedTri(4)
    normalTri(4)
    InvertedNormalTri(4)
    sandClock(4)
}