package tutorialCodes//Grade check
fun main(){
    gradeCheck()
    gradeCheckM2()
    NumberSign()
    EvenOdd()
    YearCheck()
    AgeGroup()
    calculator()
}
fun gradeCheck(){
    val marks = 44

    val findGrade = if(marks <= 100 && marks >= 70){
        "A"
    }else if(marks <= 69 && marks >= 55 ){
        "B"
    }else if(marks <= 54 && marks >= 45){
        "C"
    }else if(marks <= 44 && marks >= 38){
        "D"
    }else{
        "E"
    }
    println(findGrade)
}

fun gradeCheckM2(){//Here we use range approach
    val marks = 83

    val findGrade = if(marks in 70..100){
        "A"
    }else if(marks in 55..69 ){
        "B"
    }else if(marks in 45..68){
        "C"
    }else if(marks in 44..35){
        "D"
    }else{
        "E"
    }
    println(findGrade)
}

fun NumberSign(){
    val n = -20;

    val checkNum = if(n < 0){
        "Negative"
    }else if(n == 0){
        "Zero"
    }else{
        "Positive"
    }
    println(checkNum)
}

fun EvenOdd(){
    val n = 22

    val checkNum = if(n % 2 == 0){
        "Even"
    }else{
        "Odd"
    }

    println(checkNum)
}

fun YearCheck(){
    val year = 1945
    val ans : Boolean
    val checkYear = if(year % 100 != 0 && year % 4 == 0){
        ans = true
        "Leap Year : $ans"
    }else if(year % 400 == 0){
        ans = true
        "Leap Year : $ans"
    }else{
        ans = false
        "Leap Year : $ans"
    }
    println(checkYear)
}

fun AgeGroup(){
    val age = 12

    val CheckGroup = if(age >= 0 && age <= 12){
        "Child"
    }else if(age >= 13 && age <= 19){
        "Teen"
    }else if(age >= 20 && age <= 64){
        "Adult"
    }else{
        "Senior"
    }

    println(CheckGroup)
}

fun calculator(){
    val n1: Int = 23
    val n2: Int = 33
    val op: Char = '+'

    val result : Int = if(op == '+'){
        n1+n2
    }else if(op == '-'){
        n1-n2
    }else if(op == '*'){
        n1*n2
    }else if(op == '/'){
        n1/n2
    }else{
        throw IllegalArgumentException("Invalid Operator")
    }
    println(result)
}