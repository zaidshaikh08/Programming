package tutorialCodes
//fun main(){
//    //When we write only the values and not variables we have to maintain order
//    printMessage("zaid",22)
//
//    //With Return Type
//    println(printMessage2("saad",24))
//
//    //If we do call function in this way then we dont have to worry about order of arguments
//    println(printMessage3(age = 14,name = "Aaban"))
//    //Here i explicitly determined what is the value of which parameter
//
//    //Default Argument
//    println( printMessage4(age = 12))//Here my name is already initialized as zaid. I can change it too
//    println(printMessage4("Zaid",34))
//
//    //Single Expression Function
//    println(printMessage5("Zaid",44))
//}
//
////Basic initialization of fn with arguments without return
////This is what the meaning of named arguments is. It is that we can assign variables to store values and initialize it
//fun printMessage(name : String, age : Int){
//    println("Hello $name. Your Age is $age")
//}
//
////Return Type of Function
//fun printMessage2(name : String, age : Int) : String{
//    return "Hello $name Your age is $age"
//}
//
////assign values of arguments explicitly
//fun printMessage3(name : String, age : Int) : String{
//    return "Hello $name Your age is $age"
//}
//
////Default Arguments
//fun printMessage4(name : String = "Sir", age : Int) : String{
//    return "Hello $name Your age is $age"
//}
//
////Single Expression functions
//fun printMessage5(name : String, age : Int) = "Hello $name Your age is $age"



//Early Return Functions
// A list of registered usernames
val registeredUsernames = mutableListOf("john_doe", "jane_smith")
// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // Early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    // Proceed with the registration if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

fun main() {
    println(registerUser("john_doe", "newjohn@example.com"))
    // Username already taken. Please choose a different username.
    println(registerUser("new_user", "newuser@example.com"))
    // User registered successfully: new_user
}