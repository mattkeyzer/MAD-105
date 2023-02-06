fun main(args: Array<String>) {
    // variables for questions and answers + score init
    var q1 = "what is the first color of the rainbow?"
    var q2 = "what is how many continents are there?"
    var q3 = "how many sides does a triangle have?"
    var q4 = "how many legs does a butterfly have?"
    var q5 = "what does the chemical symbol Fe stand for?"
    var a1 = "red"
    var a2 = "seven"
    var a3 = "three"
    var a4 = "six"
    var a5 = "iron"
    var score = 0

    // introduction
    println("Welcome to matt's quiz")
    // module for correct answer
    println()
    println(q1)
    var answer1 = readLine()!!.toLowerCase()
    if (answer1 == a1){
        println("Correct")
        score++
    }
    // module for incorrect answer
    else {
        println("Sorry, The correct answer was $a1")

    }

    println()
    println(q2)
    var answer2 = readLine()!!.toLowerCase()
    if (answer2 == a2){
        println("Correct")
        score++
    }
    else {
        println("Sorry, The correct answer was $a2")

    }

    println()
    println(q3)
    var answer3 = readLine()!!.toLowerCase()
    if (answer3 == a3){
        println("Correct")
        score++
    }
    else {
        println("Sorry, The correct answer was $a3")

    }

    println()
    println(q4)
    var answer4 = readLine()!!.toLowerCase()
    if (answer4 == a4){
        println("Correct")
        score++
    }
    else {
        println("Sorry, The correct answer was $a4")

    }

    println()
    println(q5)
    var answer5 = readLine()!!.toLowerCase()
    if (answer5 == a5){
        println("Correct")
        score++
    }
    else {
        println("Sorry, The correct answer was $a5")

    }
    println()
    println("You Got $score out of 5")
}