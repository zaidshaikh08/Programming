package tutorialCodes
//fun main(){
//    //Type casting
//    val n : Any = "Manhattan"
//
//    val temp : String = n as String
//    println(temp)
//}

//aliases : Assigning a name to a particular thing that already has a name
import java.util.ArrayList as Sublist //created an alias of ArrayList
fun main(){
    //Creating aliases of imports
    var names : Sublist<String> = ArrayList()//Created an empty list
    println(names)

    names.add("Zaid")
    names.add(0,"Saad")

    println(names)
}