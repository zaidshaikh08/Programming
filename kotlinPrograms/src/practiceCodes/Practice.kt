package practiceCodes
//primary constructor
//init block
class car(var wheel : Int, var speed : Int,var model : String) {//primary Constructors
    fun speed(){//member functions
        println("$model has $speed kmph")
    }
    init {
        println("The name of the car : $model")
        println("The car is $wheel wheel drive")
    }

}

//fun main(){
//    var obj1 = car(4,200,"Ninja")
//    obj1.model = "Supra"
//    obj1.speed()
//}

//When i make secondary constructor and there is a function in it then we
//wont be able to access that function as that function is the local function.
//Secondary Constructor
//class Student{
//    var name : String = ""
//    var age : Int = 0
//
//    var grNo = 0
//    var rollNo = 0
//    constructor(name : String, age : Int){//Secondary Constructor
//        this.name = name
//        this.age = age
//
//        fun genDetails(){
//            println("Name : $name")
//            println("Age : $age")
//        }
//    }
//    constructor(grNO : Int, RollNo : Int){//Secondary Constructor
//        this.grNo = grNO
//        this.rollNo = RollNo
//
//
//        fun regDetail(){
//            println("GrNo : $grNo")
//            println("RollNo : $rollNo")
//        }
//    }
//}
//fun main(){
//    var obj1 = Student("Zaid",44)
//    obj1.
//}

//Here we made a constructor that contains information about student. 2 constructors works differently based on the
//arguments passed in it. we called different functions in 2 different constructors.
//class Student{
//    var name : String = ""
//    var age : Int = 0
//
//    var grNo = 0
//    var rollNo = 0
//    constructor(name : String, age : Int){//Secondary Constructor
//        this.name = name
//        this.age = age
//        genDetails()
//    }
//    constructor(grNO : Int, RollNo : Int){//Secondary Constructor
//        this.grNo = grNO
//        this.rollNo = RollNo
//        regDetail()
//    }
//    fun genDetails(){
//        println("Name : $name")
//        println("Age : $age")
//    }
//    fun regDetail(){
//        println("GrNo : $grNo")
//        println("RollNo : $rollNo")
//    }
//}
//fun main(){
//    var obj1 = Student("Zaid",44)
//}


//getters & setters
class StudentMarks{
    var phy = 0
        get() {
            if(field > 100){
                return 100
            }else{
                return field
            }
        }
        set(value) {
            field = value + 10
        }
    var chem = 0
        get(){
            if(field > 100){
                return 100
            }else{
                return field
            }
        }
        set(value){
            field = value + 10
        }
    var math = 0
        get() = if(field>100)  100 else  field
        set(value) {
            field = value + 10
        }
    var bio = 0
        get() {
            if(field > 100) return 100 else return field
        }
        set(value) {
            field = value + 10
        }
//every approach is same ive written all possible ones
fun setMarks(){
        phy = readln().toInt()
        chem = readln().toInt()
        math = readln().toInt()
        bio = readln().toInt()
    }
    fun printMarks(){
        println("Marks After increment : ")
        println("Physics : $phy")
        println("Physics : $chem")
        println("Physics : $math")
        println("Physics : $bio")
    }

}

//fun main(){
//    var obj1 = StudentMarks()
//    obj1.setMarks()
//    obj1.printMarks()
//}

//Private backing field with public property
//efficient when we want to restrict the access.

class StudentDetail {
    private var _phy = 0
    private var _chem = 0
    private var _math = 0
    private var _bio = 0

    var phy
        get() = _phy// _phy : actual place where value has to be stored
        set(value) {
            _phy = value + 10
        }

    var chem
        get() = _chem
        set(value) {
            _chem  = value + 10
        }
    var math
        get() = _math
        set(value) {
            _math =  value + 10
        }
    var bio
        get() = _chem
        set(value) {
            _bio = value + 10
        }

    fun setMarks(){
        phy = readln().toInt()
        chem = readln().toInt()
        math = readln().toInt()
        bio = readln().toInt()
    }
    fun printMarks(){
        println("Marks After increment : ")
        println("Physics : $phy")
        println("Physics : $chem")
        println("Physics : $math")
        println("Physics : $bio")
    }
}
fun main(){
    var obj1 = StudentDetail()
    obj1.phy = 20
    println(obj1.phy)
}