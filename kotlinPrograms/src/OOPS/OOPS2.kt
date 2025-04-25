package OOPS
//value : It is the value that is passed by the user
//field is the mechanism that is used to store the value in our variable
//So when we write field we are referring to the place where our value is stored.
//Value is the actual value that we are assigning to field

class GetSet {
    var num : Int = 0
        //getter : Here I want my value to be decreased by 1 before printing it.
        get() {
            field = field-1
            return field
        }
        //setter
        set(value){
            field = value
        }
}

//fun main() {
//    var car = GetSet()
//    car.num = 3
//    println(car.num)
//}

class Carss{
    var speed = 0

        get() {
            println("The speed of the car is : $field")
            return field
        }

        set(value) {
            if(value > 0){
                field = value
            }else {
                println("The field cannot be negative")
            }
        }
}

//fun main() {
//    var obj1 = Carss()
//    obj1.speed//printing default speed
//    obj1.speed = 23//assign value to the speed
//    obj1.speed
//    obj1.speed = -23//assign negative value to the speed
//    obj1.speed
//}


/*Create a class called  with a private variable . Write:
A getter to return the grades
A setter that validates that grades are between 0 and 100.
Add logic to the getter that formats the grades as "Grade: [value]".
Test it by setting a valid grade, an invalid grade, and retrieving grades. */

//class Grades{
//    private var marks : Int = 0
//    get(){
//        if(field >= 35){
//            println("Pass")
//        }else{
//            println("Fail")
//        }
//        return field
//    }
//
//        set(value) {
//            if(value > 100 || value < 0){
//                println("The marks is not within the range")
//            }else{
//                field = value
//            }
//        }
//}
//
//fun main() {
//    var objs = Grades()
//    objs.marks = -1//setter
//    objs.marks//getter
//    println("==========================================")
//    objs.marks = 10
//    objs.marks
//    //In this code implementation is well but not correct as we have our marks variable private. Below is the correct
//    //solution
//}

//In this code note that as i cant access the private variables, for getting and setting their values I have to make
//member functions. Using them i can get and set the values.
//class Grades{
//    private var marks : Int = 0
//        get(){
//            if(field >= 35){
//                println("Pass")
//            }else{
//                println("Fail")
//            }
//            return field
//        }
//
//    fun setValue(value: Int){//This is the setter. This type of setter is known as custom setter
//        if(value < 0 && value > 100){
//            println("Marks doesnt lies in range")
//        }else{
//            marks = value
//        }
//    }
//    fun giveMarks(){
//        println( marks)
//    }
//}
//
//fun main() {
//    var obj2 = Grades()
//    obj2.setValue(34)
//    println(obj2.giveMarks())
//}

//=========================================================================================================================

//All About Getters and Setters
//1.Basic Properties (Default Getters and Setters)
//In Kotlin, properties come with default getters and setters, so you don’t always need to define them explicitly.
//class GettingAndSettingMarks {
//    var phy = 0   // Default getter and setter provided by Kotlin
//    var chem = 0
//    var math = 0
//    var prog = 0
//
//    fun printMarks() {
//        println("Physics: $phy")
//        println("Chemistry: $chem")
//        println("Math: $math")
//        println("Programming: $prog")
//    }
//}
//
//fun main() {
//    val obj = GettingAndSettingMarks()
//    obj.phy = 34   // Uses default setter
//    println(obj.phy)  // Uses default getter, prints 34
//    obj.printMarks()
//}
//
////2.Custom Setter for Each Property
////To add 10 to every mark, you can define custom setters for each property.
//class GettingAndSettingMarks {
//    var phy = 0
//        set(value) {
//            field = value + 10   // field refers to the backing field of phy
//        }
//
//    var chem = 0
//        set(value) {
//            field = value + 10
//        }
//
//    var math = 0
//        set(value) {
//            field = value + 10
//        }
//
//    var prog = 0
//        set(value) {
//            field = value + 10
//        }
//
//    fun printMarks() {
//        println("Physics: $phy")
//        println("Chemistry: $chem")
//        println("Math: $math")
//        println("Programming: $prog")
//    }
//}
//
//fun main() {
//    val obj = GettingAndSettingMarks()
//    obj.phy = 34   // Setter adds 10
//    println(obj.phy)  // Prints 44
//    obj.printMarks()
//}
//
////3. Custom Getter and Setter
////You might also want a custom getter, for example, to ensure marks don’t exceed 100.
//class GettingAndSettingMarks {
//    var phy = 0
//        get() = if (field > 100) 100 else field  // Custom getter caps at 100
//        set(value) {
//            field = value + 10
//        }
//
//    var chem = 0
//        get() = if (field > 100) 100 else field
//        set(value) {
//            field = value + 10
//        }
//
//    var math = 0
//        get() = if (field > 100) 100 else field
//        set(value) {
//            field = value + 10
//        }
//
//    var prog = 0
//        get() = if (field > 100) 100 else field
//        set(value) {
//            field = value + 10
//        }
//
//    fun printMarks() {
//        println("Physics: $phy")
//        println("Chemistry: $chem")
//        println("Math: $math")
//        println("Programming: $prog")
//    }
//}
//
//fun main() {
//    val obj = GettingAndSettingMarks()
//    obj.phy = 95   // 95 + 10 = 105, but getter caps at 100
//    println(obj.phy)  // Prints 100
//    obj.printMarks()
//}
//
////4.Private Backing Field with Public Property
////For more control, use a private backing field and expose a public property with custom getter/setter logic.
//class GettingAndSettingMarks {
//    private var _phy = 0
//    private var _chem = 0
//    private var _math = 0
//    private var _prog = 0
//
//    var phy
//        get() = _phy
//        set(value) { _phy = value + 10 }
//
//    var chem
//        get() = _chem
//        set(value) { _chem = value + 10 }
//
//    var math
//        get() = _math
//        set(value) { _math = value + 10 }
//
//    var prog
//        get() = _prog
//        set(value) { _prog = value + 10 }
//
//    fun printMarks() {
//        println("Physics: $phy")
//        println("Chemistry: $chem")
//        println("Math: $math")
//        println("Programming: $prog")
//    }
//}
//
//fun main() {
//    val obj = GettingAndSettingMarks()
//    obj.phy = 34   // Stores 44 in _phy
//    println(obj.phy)  // Prints 44
//    obj.printMarks()
//}
//
////5. Using a Delegate-like Approach (Centralized Logic)
////If the logic is identical for all properties, you can create a reusable mechanism using a helper function or property delegate.
//class GettingAndSettingMarks {
//    private var _phy = 0
//    private var _chem = 0
//    private var _math = 0
//    private var _prog = 0
//
//    private fun adjustMarks(value: Int) = value + 10
//
//    var phy
//        get() = _phy
//        set(value) { _phy = adjustMarks(value) }
//
//    var chem
//        get() = _chem
//        set(value) { _chem = adjustMarks(value) }
//
//    var math
//        get() = _math
//        set(value) { _math = adjustMarks(value) }
//
//    var prog
//        get() = _prog
//        set(value) { _prog = adjustMarks(value) }
//
//    fun printMarks() {
//        println("Physics: $phy")
//        println("Chemistry: $chem")
//        println("Math: $math")
//        println("Programming: $prog")
//    }
//}
//
//fun main() {
//    val obj = GettingAndSettingMarks()
//    obj.phy = 34
//    println(obj.phy)  // Prints 44
//    obj.printMarks()
//}