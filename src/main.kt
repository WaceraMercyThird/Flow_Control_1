//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
//2.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these decisions,
//printing out the name of the drink each person gets according to their age.
//(2pts)
//4.Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and

fun main() {
    oddNum()
    var result = numOfNames(arrayOf("Nairobi", "Nakuru", "Embu", "Kajiado"))
    println(result)
    guestsAgeService(5)
    numbers()
}
fun oddNum() {
    for (num in 1..100)
        if (num % 2 == 0) {
            println(num)
        }
}
fun numOfNames(places: Array<String>): Int {
    var num = 0
    places.forEach { place ->
        if (place.length > 5)
            num++
    }
    return num
}
fun guestsAgeService(ages: Int) {
    if (ages < 6) {
        println("serve a glass of milk")
    } else if (ages > 6 && ages < 15) {
        println("serves a bottle of fanta orange")
    } else {
        println("gets a bottle of coca cola")
    }
}
fun numbers() {
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0)
            println("FizzBuzz")
        else if (num % 3 == 0)
            println("Fizz")
        else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
}

