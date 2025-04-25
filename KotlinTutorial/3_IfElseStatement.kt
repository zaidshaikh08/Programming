package tutorialCodes//fun main(){
//    //WAP to check if a person is eligible for license
//    var age = 18
//    var aadhar = true
////    if(age >= 18){
////        println("Enter your aadhar details")
////        if(!aadhar){//when aadhar is not there
////            println("Aadhar is mandatory, You're not eligible to vote")
////        }else if(aadhar && age >= 18){//when aadhar is there but age not
////            println("You're eligible")
////        }
////    }
////    else{
////        println("Your age is not eligible")
////    }
//
//    //If-Else as an Expression
//    var findEligiblity = if(age >= 18){
//        "Enter your aadhar details"
//        if(!aadhar){//when aadhar is not there
//            "Aadhar is mandatory, You're not eligible to vote"
//        }else {//when aadhar is there but age not
//            "You're eligible"
//        }
//    }
//    else{
//        "Your age is not eligible"
//    }
//    println(findEligiblity)
//
//    //As we can see it is only printing only the single statement of our conditions
//    //To print all the statements inside our condition, use .apply method when you actually print the first statement
//    //and use println or print so it will print all the statement. It wont print if we use double quotes
//    //use this when you're having multiple operations in ifelse
//    var findEligiblity2 = if(age >= 18){
//        "Enter your aadhar details".apply {
//            if (!aadhar) {//when aadhar is not there
//                println("Aadhar is mandatory, You're not eligible to vote")
//            } else {//when aadhar is there but age not
//                println("You're eligible")
//            }
//        }
//    }
//    else{
//        "Your age is not eligible"
//    }
//    println(findEligiblity2)
//}

//The code is the exmple of performing operations other than printing
//fun main() {
//    var isEligible: Boolean
//    val age = 20
//    val aadhar = false
//    var message: String
//
//    val findEligibility = if (age >= 18) {
//        "Enter your Aadhar details".apply {
//            // Performing other operations
//            isEligible = true
//            message = "Processing eligibility check"
//            println(message)
//            if (!aadhar) {
//                isEligible = false
//                println("Aadhar is mandatory, You're not eligible to vote")
//            } else {
//                println("You're eligible")
//            }
//        }
//    } else {
//        isEligible = false
//        "Your age is not eligible"
//    }
//
//    println(findEligibility)
//    // Example usage of isEligible
//    println("Eligibility status: $isEligible")
//}


