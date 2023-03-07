package inheritance

fun main(){
    //filler data
    var person1 = Commercial("123 Awesome Dr.", "Matt Keyzer","815-Awe-some", "2020 Cool St.", 1000.0 )
    var person2 = Residential("123 Awesome Dr.", true,"Matt Keyzer", "815-Awe-some", "2020 Cool St.",1000.0 )

    var quitProgram = false
    while (!quitProgram){
        println("Welcome to 'Matt's Lawn Services' invoice")
        println("Are you a residential or commercial customer?")
        println("residential as 'R' and commercial as 'C'")
        println("'END' to quit")
        var choice = ""
        choice = readLine()!!.toString()
        if (choice == "R"){
            person2.residentialPrintAll()
        }
        if (choice == "C"){
            person1.commercialPrintAll()
        }
        if (choice == "END"){
            quitProgram = true
        }
   }
}