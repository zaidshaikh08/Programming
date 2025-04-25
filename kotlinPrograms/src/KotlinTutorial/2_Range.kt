package tutorialCodes.tutorialCodes

fun main(){

    //Basic declaration of range
    var n = 1..4 //1,2,3,4
    println(n)

    //1. Declare range and exclude the last number
    var n1 = 1..<4 //1,2,3
    println(n1)

    //1.2 Declare range and exclude the last number
    var n2 = 1 until 4 //1,2,3
    println(n2)

    //Declare range in reverse Order
    var n3 = 4 downTo 1 //4,3,2,1
    println(n3)

    //Declare range where step is not 1
    var n4 = 1..5 step 2
    println(n4)

    //We can also do the same with chars
    var char1 = 'a'..'z'
    println(char1)

    //We can also exclude the last character
    var char2 = 'a'..<'z'
    println(char1)

    //exclude last char
    var char3 = 'a' until 'z'
    println(char3)


    //Range in reverse
    var char4 = 'z' downTo 'a'
    println(char4)

    //Step to number other than 1
    var char5 = 'a'..'z' step 2
    println(char5)
}