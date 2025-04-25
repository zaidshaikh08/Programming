package tutorialCodes
fun main(){
//    printNum()
//    IterateList()
    Exercise1()
    Exercise2()
    Exercise3()
    printTables(2)
    printArrayElements()
}
//
//fun printNum(){
//    //Basic printing of Nums
//    for( i in 1..4){
//        println(i)
//    }
//    //Method 2
//    var ranges = 1..5
//    for(i in ranges){
//        println(i)
//    }
//
//    //Print Nums of range excluding last num
//    var r1 = 1..<4
//    for(i in r1){
//        println(i)
//    }
//    //Method 2
//    for(i in 1 until 4){
//        println(i)
//    }
//
//    //Print Nums In Reverse Order
//    for(i in 5 downTo 1){
//        println(i)
//    }
//
//    //Print Nums by stepping by a particular number
//    for(i in 1..10 step 2){
//        println(i)
//    }
//
//    //Same can be done to characters too
//}
//
//fun IterateList(){
//    var list = listOf(22,33,44,55,66,77)
//    for(nums in list){
//        println(nums)
//    }
//}
//
fun Exercise1(){
    //print first 10 even numbers - We multiply numbers from 1 to 10 with 2
    for(i in 1..10){
        println(i*2)
    }
}

fun Exercise2() {
    //Using while
    var pizzaSlices = 0
    while(pizzaSlices <= 8){
        if(pizzaSlices < 8){
            println("There's only $pizzaSlices slice/s of pizza :(")
        }else{
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        }
        pizzaSlices++
    }

    //Using Do while
    var pizzaSlices2 = 0
    do{
        println("There's only $pizzaSlices2 slice/s of pizza :(")
        pizzaSlices2++
    }while(pizzaSlices2 < 8)
    println("There are $pizzaSlices2 slices of pizza. Hooray! We have a whole pizza! :D")
}

fun Exercise3(){
    var n = 1
    while (n < 100) {
        when {
            n % 3 == 0 && n % 5 == 0 -> print("FizzBuzz ")
            n % 3 == 0 -> print("fizz ")
            n % 5 == 0 -> print("buzz ")
            else -> print("$n ")
        }
        n++
    }
}

fun printTables(n : Int){
    var temp = n
    for(i in 0..100 step n){
        println(i)
    }
}

fun printArrayElements(){
    val favActivites : Array<String> = arrayOf("Cricket", "Football","Basketball")
    var count = 1
    for(i in favActivites){
        println("Activity $count : ${i} ")
        if(count < favActivites.size){
            count++
        }
    }
    //printing array element reversed
    for(i in favActivites.reversed()){//.reversed() will print elements of array in reversed direction
        println("Activity $count : ${i} ")
        count--
    }
}


