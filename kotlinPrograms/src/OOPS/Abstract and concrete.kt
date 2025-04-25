package OOPS

//In class Animal function eat is abstract
abstract class Animal{
    fun speak(){
        println("The Animal speaks : ")
    }
    abstract fun eat()
}

//Here i wont be able to do inheritance until i override the abstract function
class Cat : Animal(){
    override fun eat() {
        println("The cat is eating")
    }
}

fun main(){
    var obj1 = Cat()
    var obj2 = Animal()
    obj1.eat()
}


//Concept of abstract in kotlin variables
abstract class Bird{

    abstract var birdName : String
    open fun speak(){
        println("The $ is speaking")
    }
    open fun eat(){
    }
}

class sparrow : Bird(){
      override var birdName = ""
    override fun speak(){
        println("")
    }
}

interface InterfaceExample{
    var num : Int
    fun printNum(){
        println("The number is $num")
    }
    fun roughNum()

    fun takeNum(){
        num = readln().toInt()
        println("The number taken is $num")
    }
}

interface Interface2Example{
    var num2 : Int
    fun printNum2(){
        println("The number is ")
    }
    fun roughNum2()

    fun takeNum2(){
        num2 = readln().toInt()
        println("The number taken is ")
    }
}

class number : InterfaceExample,Interface2Example{
    override var num: Int = 32
    override fun roughNum() {
        println("")
    }
    override var num
}