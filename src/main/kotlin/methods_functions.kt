var userin = 0
var x = 0.0
var y = 0.0
fun areaoftriangle(x: Double, y: Double): Double{
    var areaoftrianglesolution =  x * y * 0.5
    return areaoftrianglesolution
}

fun areaofsquare(x: Double, y: Double): Double{
    var areaofsquaresolution = x * y
    return areaofsquaresolution
}

fun areaofrectangle(x: Double, y: Double): Double{
    var areaofrectanglesolution = x * y
    return areaofrectanglesolution
}

fun areaofcircle(x: Double, y: Double): Double{
    var areaofcirclesolution =  x * y
    return areaofcirclesolution
}

fun main() {
    do {
        println()
        println("welcome to Matt's area calculator...")
        println("what shape would you like to find the area of?")
        println()
        println("1. triangle")
        println("2. square")
        println("3. rectangle")
        println("4. circle")
        println("5. EXIT")
        userin = readLine()!!.toInt()

        if (userin == 1) {
            println("yay triangle")
            println("Please provide your first number")
            x = readLine()!!.toDouble()
            println("Please provide your second number")
            y = readLine()!!.toDouble()

            println("your area is ${areaoftriangle(x,y)} units")

        }
        if (userin == 2) {
            println("yay square")
            println("Please provide your first number")
            x = readLine()!!.toDouble()
            println("Please provide your second number")
            y = readLine()!!.toDouble()

            println("your area is ${areaofsquare(x,y)} units")
        }
        if (userin == 3) {
            println("yay rectangle")
            println("Please provide your first number")
            x = readLine()!!.toDouble()
            println("Please provide your second number")
            y = readLine()!!.toDouble()

            println("your area is ${areaofrectangle(x,y)} units")
        }
        if (userin == 4) {
            println("yay circle")
            println("Please provide your first number")
            x = readLine()!!.toDouble()
            println("Please provide your second number")
            y = readLine()!!.toDouble()

            println("your area is ${areaofcircle(x,y)} units")
        }
    }



    while(
        userin != 5
    )


}