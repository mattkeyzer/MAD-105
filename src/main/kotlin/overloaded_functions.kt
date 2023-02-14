var userinput = ""
var name = ""
var phone = ""
var buisnessname = ""

fun customerinfo(name: String,buisnessname: String ,phone: String): String{
    var print = "your name is $name \nyour buisness name is $buisnessname \nyour phone number is $phone"
    return print
}
fun customerinfo(name: String,phone: String): String{
    var print = "your name is $name \nyour phone number is $phone"
    return print

}
fun main(){
    println("are you buisness or residential?")
    userinput = readLine()!!.toString()
    if (userinput == "residential"){
        println("what is your name?")
        name = readLine()!!.toString()
        println("what is your phone number?")
        phone = readLine()!!.toString()
        var z = customerinfo(name, phone)
        println(z)
    }
    if (userinput == "buisness"){
        println("what is your name?")
        name = readLine()!!.toString()
        println("what is your buisness name?")
        buisnessname = readLine()!!.toString()
        println("what is your phone number?")
        phone = readLine()!!.toString()
        var c = customerinfo(name, buisnessname, phone)
        println(c)
    }
}


