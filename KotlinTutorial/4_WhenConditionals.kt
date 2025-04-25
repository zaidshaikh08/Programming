package tutorialCodesfun
fun main(){
    CheckRange()
    CheckRain()
    checkGrade()
    SignCheck()
    CheckEvenOdd()
    CheckLeapYear()
    GroupAge()
}

fun CheckRange(){
    val n = 10

    var result = when(n){
        in 1..10 -> "Number lies between 1 to 10"

        in 10..50 -> "Number lies between 20 to 50"

        else -> "Number lies outside the range of 50"
    }
    println(result)
}

fun CheckRain(){
    val rain = true

    var result = when(rain){
        !true -> "Not Raining "
        else -> "Raining"
    }
    println(result)
}
fun checkGrade(){
    var marks = 90;

    when {
        marks <= 100 && marks >= 70 -> println("A")

        marks <= 69 && marks >= 55 -> println("B")

        marks <= 54 && marks >= 40 -> println("C")

        marks <= 39 && marks >= 38 -> println("D")

        marks < 38 -> println("Fail")
    }

    //When as an expression
    var result = when {
        marks <= 100 && marks >= 70 -> "A"

        marks <= 69 && marks >= 55 -> "B"

        marks <= 54 && marks >= 40 -> "C"

        marks <= 39 && marks >= 38 -> "D"

        else -> "Fail"
    }
    println(result)
}

fun SignCheck() {
    var n = 10
    var result = when{
        n < 0 -> "Negative"

        n == 0 -> "Zero"

        else -> "Positive"
    }
    println(result)
}

fun CheckEvenOdd(){
    var n = 101

    val result = when{
        n % 2 == 0 -> "Even"

        else -> "Odd"
    }

    println(result)
}

fun CheckLeapYear(){
    val year = 2004

    val result = when{
        year % 4 == 0 && year % 100 != 0 ->"Leap year"

        year % 400 == 0 -> "Leap Year"

        else -> "Not a Leap Year"
    }
    println(result)
}

fun GroupAge(){
    val age = 20

    val result = when{
        age >= 0 && age <= 14 -> "Child"

        age >= 15 && age <= 20 -> "Teen"

        age >= 20 && age <= 64 -> "Adult"

        else -> "Senior Citizen"
    }
    println(result)
}

