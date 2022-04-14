fun main(){
    var acc1=CurrentAccount("2345678","mamamboga",2222.5)
    var acc2=CurrentAccount("345566","MATUNDA",345.78)
    acc2.accbal
    CurrentAccount.deposit()
    CurrentAccount.withdraw()
    CurrentAccount.details()

    var t=acc1.accbal
    var s=acc1.accno
    var a=acc1.accname
    var v=("Account number $s with balance $t is $a")

    var l=product("Soap",45.2,100.50,"Hygiene")
    var f=product("Kales",50.1,50.0,"Grocery")
    var k=product("pen",5.4,10.5,"other")
    println(l)
    println(f)
    println(k)

    var mergetwo= listOf(l,f,k)
    print(mergetwo)
    newProduct()
    evenIndex("banana")

}



open class CurrentAccount(var accno:String,var accname:String, var accbal:Double){
    //deposit(amount: Double) - Increments the balance bythe
    ////amount deposited
    fun deposit(amount: Double):Double{
        var x=0.0
        accbal+=amount
        x++
        return x
    }
    //withdraw(amount: Double) - Decrements the balanceby the
    //amount withdrawn
    fun withdraw(amount: Double):Double{
        var r=0.0
        accbal-=amount
        r--
        return r
    }
    //details() - Prints out the account number and balanceand
    ////name in this format: “Account number x with balance y is
    ////operated by z”
    fun details(){

    }
    //Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
}
open class SavingsAccount(var withdrawals:Int){


}
//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
data class product(var name:String,var weight:Double,var Price:Double,var category:String)

fun newProduct(Product:product){
    var groceries= mutableListOf <product>()
    var hygiene= mutableListOf <product>()
    var other= mutableListOf <product>()

    when(Product.category){
        "groceries"->groceries.add(1,product)
        "hygiene"->hygiene.add(1,product)
        "other"->other.add(1,product)
    }
     println(listOf(Product))
}
//Write a function that given a string returns a string composed of only
////the characters in even indices. For example given “banana” it will return
////“bnn”
fun evenIndex(words:String){
    var q=""
    words.forEachIndexed { index, h ->
        if (index % 2 == 0) {
            index += h
        }
        return q
    }
