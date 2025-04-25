package tutorialCodes.tutorialCodes
fun main(){
    //For Taking input from the user we use readln()
    var name = readln()//By default the readln treats input as string

    //Taking input as integer
    var age = readln().toInt()

}


//fun main(){
//    //Arithematic Operators
//    val n = 23;
//    var n2 = 22;
//    //addition
//    n2 = n2 + n
//    println(n2)
//
//    //subtraction
//    var n2Duplicate = n2
//    n2 = n2 - n;
//    println(n2)
//
//    //multiplication
//    n2 = n2 * n
//    println(n2)
//
//    //division
//    n2 = n2 / n
//    println(n2)
//
//    //floating point division
//    var n3 = n2.toFloat() / n //new variable is assigned with the value of n2 because kotlin will not accept float in integer dtype var
//    println(n3)
//
//    //Modulus(Remainder)
//    n2 = n2 % n
//    println(n2)
//
//    //Augmented Assignment operators - (+= -= *= /= %=)
//
//    //Increment and Decrement
//    //Pre-Increment- Update the value
//    var num = 23;
//    println(++num)
//
//    //Post-Increment - Update the value after the operation is preformed
//    println(num++)
//    //Same concept for Decrement
//}

//fun main(){
//    //relational Operators
//    val num = 10;
//    val num2 = 10;
//
//    val condn1 = num > num2;
//    println("First number is greater than second : $condn1")
//
//    val condn2 = num < num2;
//    println("First number is less than second : $condn2")
//
//    val condn3 = num <= num2
//    println("First number is less or equal to second : $condn3")
//
//    val condn4 = num >= num2
//    println("First number is greater or equal to second : $condn4")
//
//    val condn5 = num == num2
//    println("First number is equal to second : $condn5")
//
//    val condn6 = num != num2
//    println("First number is not equal to second : $condn6")
//
//}

//fun main(){
//    //Logical Operators
//    //WAP to check if the student is eligible for giving an interview. He/She is eligible when grade is greater than 70 and he knows programming
//    val grade : Int = 72
//    val programming : Boolean = true
//
//    //AND Operator (&&)
//    if(grade > 70 && programming){
//        println("You're Eligible for interview")
//    }else{
//        println("Sorry you're not eligible")
//    }
//
//    //OR Operator(||)
//    //Here if student has greater than 70 OR he knows programming then he/she is eligible
//    if(grade > 70 || programming){
//        println("You're eligible for interview")
//    }else{
//        println("Sorry you're not eligible")
//    }
//
//    //NOT Operator(!)
//    //Here if student dont knows how to program then he/she is not eligible
//    if(!programming){
//        println("Sorry you're not eligible")
//    }else{
//        println("You're eligible for interview")
//    }
//
//    //Short Circuiting
//    //Short-circuit evaluation is a concept in programming where logical operators (like AND && and OR ||)
//    // evaluate their expressions in a way that stops as soon as the result is determined.
//    var j = 11
//
//    var condition = i == 10 || j == ++j
//    println(condition)
//    println(i)
//    println(j)
//    //Here the thing happend is that it checked only the first condition i==10 and as it was true
//    //it did'nt checked for further condn because of || operator
//}