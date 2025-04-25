package OOPS.concepts

// Initialization of a class. we can also pass some of the parameters to the class.
//class Person(var name : String, var age : Int){//Primary constructor
//    // Member function Initialization
//    fun validAadhar(aadhaar : Boolean){
//
//        if(aadhaar == true){
//            println("You can get the scheme")
//        }
//        else{
//            println("Your aadhaar is inappropriate")
//        }
//    }
//}
//
//fun main(){
//    //Object Initialization
//    var obj1 = Person("Zaid",23)
//    //Accessing Member function
//    obj1.validAadhar(true)
//}
// Primary constructors : The properties of a class that is initialized as a parameter of a class using val/var is known as Primary constructor


//primary constructors
//class Students(var name : String, var age : Int = 18){//Default value added as if any student forgets to enter the value
//    var rollNo : Int? = null
//    var PhoneNo : Long? = null
//
//    fun setRoll(RollNo : Int){
//        rollNo = RollNo
//    }
//    fun getRoll(){
//        println(rollNo)
//    }
//
//    fun setPhone(phone: Long){
//        PhoneNo = phone
//    }
//    fun getPhone(){
//        println(PhoneNo)
//    }
//}
//
//fun main(){
//    var person1 = Students(name = "Namoum", age = 34)
//    person1.setRoll(34)
//    person1.getRoll()
//    person1.setPhone(8878909087)
//    person1.getPhone()
//
//    //we can also access data members of class
//    println("Student name ${person1.name}")
//    println("Student Age ${person1.age}")
//    println("Student RollNo ${person1.rollNo}")
//    println("Student Phone ${person1.PhoneNo}")
//
//}

//Primary constructor
class Car(brand : String, model : String){
    var price : Int? = null

    fun calculatePrice(LaunchPrice : Int){ //This will get us the value of the car
        var depreciation = (LaunchPrice * 10) / 100
        price = LaunchPrice - depreciation
        println("The value of the car after 1 year use is : $price")
    }
}
//fun main() {
//    var car1 = Car("Toyota","Supra")
//    car1.calculatePrice(10000)
//}

//init Block
//class Cars{
//    var brand : String
//    var modelYear : Int
//    var price : Int
//
//
//    init {
//        print("Enter the name of the car brand : ")
//        brand = readln()
//        print("Enter the name of the car model : ")
//        modelYear = readln().toInt()
//
//        price = when(modelYear){
//            2000 -> 10000
//            2001 -> 12000
//            else -> 0
//        }
//        println(price)
//    }
//}
//fun main(){
//    var car1 = Cars() //when i make this object as it has been initialized init block it will directly execute all the init block
//}

//Multiple init block in single class
class Student{
    var name : String
    var age : Int
    var gr : Int
    init {
        print("Enter your name : ")
        name = readln()
        print("Enter your age : ")
        do {
            age = readln().toInt()
            if(age < 18 || age > 100){
                println("Invalid")

            }
        }while(age < 18 || age > 100)
        print("Enter GR : ")

        do {
            gr = readln().toInt()
            if(gr < 100 || gr > 6000){
                println("Invalid")
            }
        }while(gr < 100 || gr > 6000)//Suppose students gr starts from 100 and ends at 6000

        println("A")
    }
    init {
        var i = 0
        while(i < 10){
            println(23)
            i++
        }
    }
}

class Cars{
    var brand : String
    var Model : String
    var price : Any?

    constructor(brand : String, Model : String, price : Int){
        //when we use this.varName the variable will call the global variable and to that global variable we can assign the value of local variable
        this.brand = brand
        this.Model = Model
        this.price = price
    }
    constructor(brand: String, Model: String){
        this.brand = brand
        this.Model = Model
        this.price = "Not Defined"
    }

    fun CarDetail(){
        println("Car Details : \nBrand Name : $brand\nModel : $Model\nPrice : $price ")
    }
}

//when we use secondary constructor we are able to overload the constructor i.e.. construtor of same class will act different based on different arguments provided
fun main(){
    //I'll make different objects by invoking different parameters
    var car1 = Cars("Suzuki","Swift",23330)
    var car2 = Cars("Suzuki","Zen")

    car1.CarDetail()
    car2.CarDetail()
}