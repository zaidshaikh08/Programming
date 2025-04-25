package OOPS

import org.w3c.dom.css.Rect

//open class Shape{
//    var shapeName : String = ""//shape name
//
//    open fun findArea(){
//        println("calculating area of shape")
//    }
//    fun printArea(){
//        println("The area of $shapeName is : $")
//    }
//}
//
//class circle : Shape(){
//    override fun findArea(){
//        println("Calculating the area of cicle")
//    }
//}
//
//fun main() {
//    var obj1 = circle()
//    obj1.shapeName = "circle"
//    obj1.findArea()
//    //Here i did function overriding
//    var obj2 : Shape =  circle()
//    //here what i am doing is that im telling the compiler that my obj2 is of type Shape and my object is Circle()
//    //Im able to do this because circle is the child of Shape.
//    //If i try to do reverse of it then i wont be able to do it
//
//}


//Im making a new function which is outside the class and in that function I passed the shape of type Shape()
//which is my parent class. Now we know that my parent is the class Shape() and my child are Circle() amd Rectangle()
//So now in my new function, whatever shape i pass as my object that function behavior will be applied and the result will
//be based on that object's function.
//open class Shape(){
//    open fun findArea(){
//        println("Calculating the area of Shape")
//    }
//}
//
//class Circle() : Shape(){
//    override fun findArea(){
//        println("Calculating the area of Circle")
//    }
//}
//
//class Rectangle : Shape(){
//    override fun findArea(){
//        println("Calculating the area of Rectangle")
//    }
//}
//
////Now im making a new function that will take the object and print based on the object passed in it as args
//fun giveShape(shape : Shape){
//    shape.findArea()
//}
//
//fun main(){
//    var shape = Rectangle()
//    giveShape(shape)
//}

//Function overriding + using the parent function in that function that overrides
open class Shape(){
    open fun findArea(){
        println("Calculating the area of Shape")
    }
}

class Circle() : Shape(){
    override fun findArea(){
        println("Calculating the area of Circle")
    }
}

class Rectangle : Shape(){
    override fun findArea(){
        println("Calculating the area of Rectangle")
        super.findArea()
    }
}

//Now im making a new function that will take the object and print based on the object passed in it as args
fun giveShape(shape : Shape){
    shape.findArea()
}

fun main(){
    var shape = Rectangle()
    giveShape(shape)
}



//Compile time polymorphism(function overloading)
//class shape{
//    fun findArea(l : Int, b : Int){
//        println("Area of Rectangle : ${l*b}")
//    }
//    fun findArea(l : Int, b : Int, h : Int){
//        println("Area of triangle : ${l*b*h}")
//    }
//    fun findArea(s : Int){
//        println("Area of square : ${s*s}")
//    }
//}
//
//fun main() {
//    var obj1 = shape()
//    obj1.findArea(2)//this will calculate the area of square
//    obj1.findArea(2,3,4)//this will calculate the area of triangle
//    obj1.findArea(2,3)//this will calculate the area of Rectangle
//}