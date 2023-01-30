fun main() {
    var userin = 0

    do {
        println()
        println("Welcome to Matt's Marvelous Diner...")
        println("What do you fancy?")
        println()
        println("1. Hamburger")
        println("2. Cheeseburger")
        println("3. BLT")
        println("4. Panini")
        println("5. Grilled Cheese")
        println("6. EXIT")
        userin = readLine()!!.toInt()

        if (userin in 1..5 )
            println()
            println("yay")
    }

     while(
         userin != 6
    )

}