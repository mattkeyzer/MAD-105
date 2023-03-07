package inheritance

/**
 * @author Matt Keyzer
 * date: mar 6 2023
 *
 */
fun main(){
    //filler data
    var person1 = Commercial("123 Awesome Dr.", "Matt Keyzer","815-Awe-some", "2020 Cool St.", 1000.0 )
    var person2 = Residential("123 Awesome Dr.", true,"Matt Keyzer", "815-Awe-some", "2020 Cool St.",1000.0 )
    // output to user
    var quitProgram = false
    while (!quitProgram){
        //menu
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