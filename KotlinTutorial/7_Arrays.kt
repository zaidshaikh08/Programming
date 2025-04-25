//package tutorialCodes
//fun main(){
//    //Note while initializing the array you must use var and val at right places
//
//    //Array Initialization
//    val name : Array<String> = arrayOf("value1","value2")
//    var names : Array<String> = arrayOf("Manhattan","Superman","Batman")
//    //print elements of array
//    println(names[0])
//    println(names[1])
//    //Change the value of arrayElements
//    names[0] = "Flash"
//    names[1] = "Wanda"
//    println(names[0])
//    println(names[1])
//
//}

//New tutorial codes
fun main() {
    //1.Initialize an array
    val arr: Array<String> = arrayOf("Namaome", "Batman", "Iron Fist")
    var arr2: Array<String> = arrayOf(
        "Namaome",
        "Batman",
        "Iron Fist"
    )//Initialized them 2 times to make you know that it can be initialized as var and val
    //2.Simple way to Initialize an array
    var numbers = arrayOf(1, 2, 3, 4, 5)
    //3.Initialize an array with all the elements as any number at every index
    var num = Array(10) { 0 }
    //4.Print All elements present inside the array
    println(num.contentToString())
}