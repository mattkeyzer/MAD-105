fun main(args: Array<String>) {
    println("Let's learn some Spanish...")
    println("Enter a number 1 - 10")
    val number = readLine()!!.toInt()
    if (number !in 1..10)
        println("Please try again!")


    else {
        var numString = "x"

        when (number){
            1 -> numString = "Uno"
            2 -> numString = "Dos"
            3 -> numString = "Tres"
            4 -> numString = "Cuatro"
            5 -> numString = "Cinco"
            6 -> numString = "Seis"
            7 -> numString = "Siete"
            8 -> numString = "Ocho"
            9 -> numString = "Nueve"
            10 -> numString = "Diez"
            !in 1..10 -> numString = "Out of Range"
            else -> numString = "Unknown"
        }

        println("$number in spanish is $numString")

    }
}