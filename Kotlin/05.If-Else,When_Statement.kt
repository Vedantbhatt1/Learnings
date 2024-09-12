// If Statements

/*
fun main(){
    val temp = 20
    if(temp>25){
    	println("Warm day")
    }
}
*/

// If - else Statements
/*
fun main(){
    val age = 18
    if(age>=18){
        println("You are an adult")
	}
    else{
        println("Balak")
    }
}
*/

/*
fun main(){
    val score = 90
    if(score>=90){
        println("A")
	}
    else if(score>=85){
        println("B")
	}
    else if(score>=70){
        println("C")
    }
    else{
        println("D")
    }
}
*/

// Calculator with all airthmatic operators
/*
fun main(){
    var a = 10
    var b = 5
    val op = "/"
    if(op=="+"){
        println(a+b)
	}
    else if(op=="-"){
        println(a-b)
	}
    else if(op=="*"){
        println(a*b)
	}
    else if(op=="/"){
        if(b!=0){
            println(a/b)
        }
        else{
            println("B can not be zero")
        }
	}
    else if(op=="%"){
        println(a%b)
	}
    
}
*/


/*
fun main(){
    val age = 10000
    if(age<13){
        print("Balak")
    }
    else if(age in 13..19){
        print("Teenager")
    }
    else{
        print("Adult")
    }
}
*/

// When
/*
fun main(){
    val dayOfWeek = 3
    val dayName = when(dayOfWeek)
    {
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "Invalid Day"
    }
    print("The 3rd day of the week is $dayName")
}
*/

// When as Statement

fun main(){
    val num = 8924092
    when{
        num%2==0-> println("$num is even")
        num%2!=0-> println("$num is odd")
        else-> println("Baigan")
    }
}
