import java.text.DecimalFormat
var amount = 1.0
var total = 0.0
var formattotal = 0.0
var tiptotal = 0.0
var formattip = 0.0
val tax = 1.025
val tiprate = .175
var finaltotal = 0.0
val twoDigits = DecimalFormat("#.00")
var totalwithtip = 0.0
fun main(args: Array<String>) {
    while (amount != 0.0 ){
        println("please input cost of items (a 0 will end the program)")
        amount = readln().toDouble()
        total += amount
        finaltotal = total * tax
        tiptotal = finaltotal * tiprate
        formattotal = twoDigits.format(finaltotal).toDouble()
        formattip = twoDigits.format(tiptotal).toDouble()
        totalwithtip = formattotal + formattip
        totalwithtip = twoDigits.format(totalwithtip).toDouble()
        println("the total is now $$formattotal")
        println("the recommended tip is $$formattip")
        println("with the recommended tip your total will be $$totalwithtip")

    }
}