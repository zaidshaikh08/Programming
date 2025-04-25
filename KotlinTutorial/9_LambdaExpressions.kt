package tutorialCodes
//Initialization of function as lambda expression
//Assign variable as we do
//Now assignment operator and then curly brackets and inside the brackets intialize the prameters
//If multiple parameters then separate them with comma. After we assign all the parameters we use -> and then
//body of the function should be written within the curly brackets
//Eg :- var num = {parameterName : Dtype -> BodyOfFunction}

fun main(){
    LambdaExpressions()

}
fun LambdaExpressions(){

    //Concise lambda expression
    var add = {num1 : Int, num2 : Int -> num1+num2}
    println(add(2,2))

    //Lambda expression without parameters
    var sub = { "Hello world" }
    println(sub())

    //Function types - Lambda function also sometimes requires the initialization of return type so that it will be cleared what that function can do and what it cannot do
    //Explicit declaration of return type in Lambda function - varName (Parameter Dtype) -> ReturnType = {parameter - > Body}
    var addNum: (Int,Int) -> Int = {i,j -> i+j}
    println(addNum(2,3))

    //when we have no parameter and we specify the return type
    var addNums : () -> Unit = {"Hello"}
    print(addNums())

    
}

//Exercise 1 : Simple lambda functions
//fun main(){
//    convertUpper("Zaid")
//    checkEven()
//    Square()
//}
////1.Write a lambda function to convert uppercase
//fun convertUpper(str : String){
//    var stringUpper = {str.uppercase()}
//    println(stringUpper())
//}
////2.Check if even or not
//fun checkEven(){
//    var EvenCheck = {n1 : Int, n2 : Int ->
//        when{
//            n1 % 2 == 0 && n2 % 2 == 0 -> "Both are even"
//
//            else -> "Not even"
//        }
//    }
//    println(EvenCheck(4,2))
//}
////3.SquareOfNumber
//fun Square(){
//     var num = {n : Int -> n*n}
//    println(num(2))
//}

//Exercise 2 : Pass lambda expression as parameter of another function
//Pass to another function
//A great example of when it is useful to pass a lambda expression to a function, is using the .filter() function on collections:
//fun main() {
//    val numbers = listOf(1, -2, 3, -4, 5, -6)
//
//    val positives = numbers.filter({ x -> x > 0 })
//
//    val isNegative = { x: Int -> x < 0 }
//    val negatives = numbers.filter(isNegative)

//    println(positives)
// [1, 3, 5]
//    println(negatives)
// [-2, -4, -6]
//}
//The .filter() is used to select elements based on the condition. The .filter() function accepts a lambda expression as a predicate:
//{ x -> x > 0 } takes each element of the list and returns only those that are positive.
//{ x -> x < 0 } takes each element of the list and returns only those that are negative.

//For positive numbers, the example adds the lambda expression directly in the .filter() function.
//For negative numbers, the example assigns the lambda expression to the isNegative variable.
// Then the isNegative variable is used as a function parameter in the .filter() function.
// In this case, you have to specify the type of function parameters (x) in the lambda expression.

//Another good example, is using the .map() function to transform items in a collection:
fun ExpAsParameter() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled)
// [2, -4, 6, -8, 10, -12]
    println(tripled)
// [3, -6, 9, -12, 15, -18]
}
//.map() is used to transform the value.The .map() function accepts a lambda expression as a transform function:
//{ x -> x * 2 } takes each element of the list and returns that element multiplied by 2.
//{ x -> x * 3 } takes each element of the list and returns that element multiplied by 3.