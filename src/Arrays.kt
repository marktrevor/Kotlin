fun main(args: Array<String>) {
//data structure
    var arr =   arrayOf(10, 23.4, "John", 'W')
    var arr1 =   arrayOf<Int>(12,43,323,33,24,232)
    var arr2 =   arrayOf<String>("Peter","John","Samuel")

//    modifying a value within array

    var fruits = arrayOf("Oranges","Pineapple","Mangoes")
    fruits[2] = "Apples"
    println(fruits[2])

//    modify array using det function
    var names = arrayOf("Esther","Ndungu","Wanjiru","Kinuthia")
 names.set(2,"Andrew")
    println(names[2])
names.set(3,"Speed")
    println(names[3])

//fetching a value using the get function

    var browsers = arrayOf("Firefox","Safari","Chrome","Brave","Edge")
    println(browsers[2])
    println(browsers.get(2))
    println(browsers.get(4))

























}