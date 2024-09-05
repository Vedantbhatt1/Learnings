/*
fun checkDiscount(amount:Int,isMember:Boolean){
    if(amount>1000 && isMember==true){
        println("You are eligible for 20% discount")
    }
    else if(amount>1000 && isMember==false){
        println("You are eligible for 10% discount")
    }
    else{
        println("You are not eligible for discount")
    }
}

fun main(){
    var amount:Int = 2037
    var isMember:Boolean = true
    checkDiscount(amount,isMember)
}
*/


fun main(){
    var amount:Int = 23000
    var isTrue:Boolean = true
    while(isTrue){
        print("Enter the amount to withdraw = ")
        var a:Int = 11234;
        if(a>amount){
        	println("Not Enough funds")
    	}
    	else{
        	amount-=a
        	println("Remaining balance is $amount")
    	}
        print("Do you want to continue")
        var b:Int = 0
        if(b==0){isTrue=false}
    }
}
/*

fun main() {
    var amount: Int = 23000
    var isTrue: Boolean = true
    
    while (isTrue) {
        print("Enter the amount to withdraw: ")
        val a: Int = readLine()?.toIntOrNull() ?: 0
        
        if (a > amount) {
            println("Not Enough funds")
        } else {
            amount -= a
            println("Remaining balance is $amount")
        }
        
        print("Do you want to continue? (1 for Yes / 0 for No): ")
        val b: Int = readLine()?.toIntOrNull() ?: 0
        if (b == 0) {
            isTrue = false
        }
    }
}



*/
