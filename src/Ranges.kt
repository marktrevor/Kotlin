fun main(args: Array<String>) {
    var number = 1.. 5
    for (num in number){
        println(num)
    }
    var alphabet = 'A'.. 'Z'
    for (char in alphabet){
        print(char)
    }
//use rangeTo() instead of '..'

    var namba = 1.rangeTo( other = 5)
    for (x in namba){
        println(x)
    }

    var number1 = 'W'.downTo(to= 'A')
    for (y in number1){
        println(y)
    }

  var OneToTen = 1.. 10
    var even = OneToTen.step(5)
    for (w in even){
        println(w)
    }









}