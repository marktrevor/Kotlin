fun main(args: Array<String>) {
   println(birthdayGreeting("Andrew",  18,"Felix"))
    println(birthdayGreeting("Esther",  20,"Trevor"))
    println(birthdayGreeting("Ruto",  58,"Jane"))
    println(greet( ))
   println(birthdayGreeting())
    val radius=5.0
    val area =
        Calculate(radius)

    println("The area of the circle with radius $radius is $area")


    val height= 1.75
    val weight= 54.4
    val bmi = calculateBMI(height,weight)
    println("Your BMI is $bmi")

}

fun Calculate(radius:Double, pi: Double = 3.14): Double {
    return pi * radius * radius



}

fun birthdayGreeting(name: String="Tom",age:Int=30,sender:String="Peter"): String {
   val m ="Happy birthday $name"
    val n ="You are $age years old"
    val p ="Regards from $sender"
    return "$m\n$n\n$p"
}
fun greet(name: String="George"): String  {
    val j= "Hello $name how was your day"
    return "$j"
}
//write a kotlin function that calculates the area of
// a circle. Use the default value for pi as 3.14


//write a kotlin function that calculates the bmi of


fun calculateBMI (height: Double= 1.7, weight: Double=54.4): Double {
    return weight / (height * height)
}


