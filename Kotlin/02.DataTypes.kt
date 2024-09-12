/*
 
fun main(){
    val a = 10
    val b = 20
    val result = "The Sum of $a and $b is ${a+b}"  //String Interpolation
    println(result)
}

*/

//Data Types

/*
Byte [8 bit] [-128 to 127]
Short [16 bit] ...
.
.
.
*/


// Character Data Types

/*

fun main(){
    val letter:Char ='A'
    print(letter)
    print('\n')
    print('\$')
    print('\\')
}

*/


/*
fun main(){
    var a = """
    V
    e
    d
    a
    n
    t
    """
    print(a)
    
    var b = """
    Ram
    	Ram
            Ram"""
    println(b)
    print('\n')
    print("\t Ram \n Ram \t \t Ram \n \t Ram")
}


*/


fun main(){
	val numbers = arrayOf(1,2,3,4,5)
	val words:Array<String> = arrayOf("aa","bb")
	val squares = Array(5){i->i*i}
    println(numbers[0])
    println(words[0])
    println(squares[4])
}
