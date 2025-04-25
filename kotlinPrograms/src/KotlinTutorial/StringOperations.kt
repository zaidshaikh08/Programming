package tutorialCodes

fun main(){
    val str = " Zaid Shaikh"

    //1. Concatenation of a string
    val num = 2
    println("The roll number of student "+str+" is "+num) //we mostly use string templates for this type of printing

    //2. length of the string
    println(str.length)
    println(str.count())//these are the two ways to find length

    //3. Selection of selected part of a string
    println(str.substring(1,str.length))//indexing of method starts from 0

    //4. Changing cases of string
    println(str.uppercase())
    println(str.lowercase())

    //5. Remove characters from the string : //indexing starts from 1
    println(str.drop(5))//removes all char from first indexes
    println(str.dropLast(1))//removes from last indexes

    //6. Initializing Quotes inside a string
    println("It's okay to be not okay")

    //7. Finding a string inside a string : //indexing starts from 0
    println("The beginning of the index of the given string inside the string is : "+ str.indexOf("hail"))

    //8. returns a character at the given index or null if the index is out of bounds of this char sequence.
    println("character at the given index is : "+ str.getOrNull(10))

    //9. Convert to String : //we can convert any dtype into String
    println(num.toString())

    //10. Returns string of particular range : // indexing starts from 0
    println("Slicing of string results into : "+ str.slice(0..10))

    //11. It returns a string having leading and trailing whitespace removed.
    println("Removal of whitespace results into : "+str.trim())

    //12. Replacing the string
    println(str.replace('a','k'))
    println(str.replace('a','k'))

    //13. It returns a new string with the first occurrence of oldChar replaced with newChar.
    println(str.replaceFirst('a','e'))

    //14. It replaces the part of string at the given range with the replacement string.
    println(str.replaceRange(0,10,"Malik"))

    //15. It reverses the characters of a string and return a new string containing characters of this string in reverse order.
    println(str.reversed())

}