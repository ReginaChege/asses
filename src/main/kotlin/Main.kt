fun main(){
    random("Regina")
    println(pass("Regina123"))
    println(pass("Richard657?!09875"))
    var currentAccount=CurrentAccount("while12345","Regina",12345.90)
    var currentAccount2=CurrentAccount("while17890","Ann",156235.90)
    println( currentAccount.deposit(456789.90))
    (currentAccount2.details())
    currentAccount.balance

    println(currentAccount.withdraw(23.800))
    var savingAccount=SavingAccount("Philiph","today987654",876543.89)
    var savingAccount2=SavingAccount("Eunice","today0987654",9873456.87)
    savingAccount.withdraw(76543.90)

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun random(name:String){
//var first=name.last()
//    return first
    var length=name.length
    println(length)
//    var present=0
//    var  vowels=('a','e','i','o','u')
//    for (n in vowels){
//        return n

}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun pass(password:String):String{
    var word=0
    if (word<8){
        return ("Must be at least 8 characters long")
    }
    else if (word<=16){
        return("Must be at most 8 characters long")
    }
    else if (word==0){
        return("must not be a password")
    }
    else{
        return(" Must contain a digit")
    }
}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
//fun multiple(numbers:Array<Int>){
//    var multiple=1
//for ()
//}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        var diposit=balance+amount
        return balance++
    }
    fun withdraw(amount:Double):Double{
        var widtdraw=balance-amount
        return balance--
    }
    fun details(){
        println("AccountNumber ${accountNumber}countNumber with balance $balance is operated by $accountName ")
    }
}



//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingAccount(accountName: String,accountNumber: String,balance: Double):CurrentAccount(accountNumber,accountName,balance){
    fun numberOfwithdrawal(withdrawal:Int) {
        var  withdrawal = 0
        if (withdrawal <= 4 && withdrawal == withdrawal++) {
            println("You can withdraw from the account")
        }

    }
}