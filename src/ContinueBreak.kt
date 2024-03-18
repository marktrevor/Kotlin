fun main() {
    for (n in 1.. 5){
        println("before continue, loop $n")
        if (n==2||n==4)
            continue
        println("after continue, loop $n")
    }
    for (m in 1..10) {
        println("before break, loop $m")
        if (m == 5) {
            println("Terminating the loop.....")
            break
        }
    }

//Create an algorithm that loops alphabet a-z and
//    breaks at point 'q'
    for (letter in 'A'..'Z'){
        print("$letter ")
        if (letter == 'Q'){
            println("Terminating the loop.....")
            break
        }
    }





















}