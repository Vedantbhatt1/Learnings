
// Fibonacci Series
/**
fun main() {
    val n = 15
    FibonacciSeries(n)
}

fun FibonacciSeries(n: Int) {
    var first = 0
    var second = 1

    print("Fibonacci Series up to $n terms: ")

    for (i in 1..n) {
        print("$first ")

        val next = first + second
        first = second
        second = next
    }
}
**/

// Secondary Constructor
/*
class Person{
    var name:String
    var age:Int
constructor(x:String,y:Int){
    this.name = x
    this.age = y
}constructor(x:String){
    this.name = x
    this.age = 18
}constructor(){
    this.name = "Vedant"
    this.age = 20
}fun intro(){
    println("My name is $name and age is $age")
}
}

fun main(){
    var a = Person("Riya",22)
    a.intro()
    var b = Person()
    b.intro()
    var c = Person("Heena")
    c.intro()
}
*/


// Primary Constructor
/*
class Person(var name:String,var age:Int){
    constructor(x:String):this(x,18)
    constructor():this("Rahul",40)
    fun intro(){println("My name is $name and age is $age")}
}

fun main(){
    var a = Person("Riya",22)
    a.intro()
    var b = Person()
    b.intro()
    var c = Person("Heena")
    c.intro()
}
*/

open class Rectangle(val a:Double, val b:Double){
    fun area():Double{return a*b}
    open fun display(){println("Area of the rectangle with dimension $a and $b is${area()}")}
}
class Square(val side:Double):Rectangle(side,side){
    override fun display(){println("Area of Square with $side and $side is ${area()}")}
}
fun main(){
    val myRectangle = Rectangle(4.0,5.0)
    myRectangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}
