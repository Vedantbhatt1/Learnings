// Default Arguments (Function)
/*
fun sum(a:Int=100,b:Int=23){
    println(a+b)
}
fun main(){
    sum()
    sum(23,34)
}
*/



// Without Default Arguments (Function)
/*
fun sum(a:Int,b:Int){
    println(a+b)
}
fun main(){
    sum(12,23)
    // sum() will give error
}
*/



// Return
/*
fun sum(a:Int,b:Int):Int{
    return(a+b)
}
fun main(){
    println(sum(32,37))
}
*/


// Create a function -> Celcius to Fahrenheit
/*
fun temp(cel:Int){
    val result = ((9*cel)/5)+32
    println(result)
}
fun temp1(fhr:Int){
    val result = (fhr-32)*5/9
    println(result)
}
fun main(){
    temp(-40)
    temp1(-40)
}
*/

// Factorial
/*
fun fact(num:Int,factorial:Int=1){
    if(num>1){
        var factorial = factorial * num
        fact(num-1,factorial)
    }
    else{
        print(factorial)
    }
}
fun main(){
    fact(5)
}
*/
