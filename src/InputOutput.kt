import java.util.Scanner
fun main(args: Array<String>) {
    print("Please enter your name:")
   var enteredString = readLine()
    println("You have entered the string $enteredString ")

    print("Please enter a number ")
    var enteredNumber = Integer.valueOf(readLine())
    println("You have entered a number $enteredNumber")

    var read = Scanner(System.`in`)
    println("Please enter an Integer")
    var enteredInteger = read.nextInt()
    println("The integer entered is $enteredInteger")






    println("Please enter a Float")
    var enteredFloat = read.nextFloat()
    println("The integer entered is $enteredFloat")






    println("Enter your age:")
    val age = readLine()!!.toInt()

    println("Enter your weight: ")
    val weight =
readLine()!!.toDouble()

    val result = age * weight
    println("The result is $result")





}


