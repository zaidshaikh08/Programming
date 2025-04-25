package OOPS

//Basic Inheritance with function overriding
//open class Samosa{
//    var aloo : String = ""
//    open var masala : String = ""
//
//    open fun makeSamosa(){
//        println("Adding $aloo")
//        println("Adding $masala")
//        println("Preparing Samosa")
//    }
//}
//class MeethaSamosa() : Samosa(){
//    override var masala = ""
//
//}
//
//fun main() {
//    var obj1 = Samosa()
//    obj1.aloo = "Potato"
//    obj1.masala = "Garam Masala"
//    obj1.makeSamosa()
//
//    var obj2 = MeethaSamosa()
//    obj2.aloo = "SweetPotato"
//    obj2.masala = "Sugar Syrup"
//    obj2.makeSamosa()
//}

//Inheritance Practice
//open class Animal{
//    var name : String = ""
//    var type : String = ""
//    var age : Int = 0
//
//    open fun speak(){
//    }
//}
//class Dog : Animal(){
//    override fun speak(){
//        println("Woof")
//    }
//    fun makeBark(){
//        println("Bark Fluffy....")
//        speak()
//    }
//    fun dogDetails(){
//        println("Name : $name")
//        println("Name : $type")
//        println("Name : $age")
//    }
//}
//
//fun main() {
//    var obj1 = Dog()
//    obj1.name = "Fluffy"
//    obj1.type = "mammals"
//    obj1.age = 34
//    obj1.makeBark()
//    obj1.dogDetails()
//}

//open class Vehicle(var maxSpeed : Int, var fuel_type : String?){
//    open fun showDetails(){
//        println()
//    }
//    fun move(){
//        println("Vehicle is moving")
//    }
//    open fun honk(){
//
//    }
//    open fun sound(){
//
//    }
//}
//class car(var type : String, var name : String,var CustomSound : String ="Vroom Vroom") : Vehicle(60,null){
//    override fun showDetails(){
//        println("Vehicle type : $type ")
//        println("Vehicle Name : $name")
//        println("fuel required : $fuel_type")
//        println("maxSpeed : $maxSpeed")
//        println("fuelType : $fuel_type")
//    }
//    override fun honk(){
//        println("Tonk Tonk")
//    }
//    override fun sound(){
//        println("Vroom Vroom")
//    }
//
//}
//
//fun main() {
//    var obj1 = car("Car","Supra","Npppppp tak tak tak......")//here i modified the sound of supra
//    obj1.showDetails()
//    obj1.honk()
//    obj1.sound()
//    println("==========================================================================")
//    var obj2 = car("Car","Innova")
//    obj2.maxSpeed = 100
//    obj2.fuel_type = "petrol"
//    obj2.showDetails()
//    obj2.honk()
//    obj2.sound()
//}

open class Person{
    var name : String = ""
    var occupation : String = ""

    open fun introduce(){
        println("Hello, I am $name\nI work as a $occupation")
    }
}
class Student : Person() {
    var grade_Level : String = ""

    override fun introduce(){
        println("Hello, I'm a student, My name is $name\nMy occupation is $occupation\nMy grade level is $grade_Level")
    }
}

fun main() {
    var student1 = Student()
    student1.name = "Zaid"
    student1.occupation = "Student"
    student1.grade_Level = "SSC"
    student1.introduce()
}

