interface Shape{
    fun area():Double
}
open class Rectangle(val a:Double, val b:Double):Shape{
    override fun area():Double{
        return a*b
    }
    open fun display(){
    println("Area of Rectangle with dimension $a and $b is ${area()}")
    }
}

class Square(val side:Double):Rectangle(side,side){
    override fun display(){
        println("Area of Square with side $side is ${area()}")
    }
}
fun main(){
    val myRectangle = Rectangle(3.4, 5.3)
    myRectangle.display()
    val mySquare = Square(2.2)
    mySquare.display()
}
