fun main(args: Array<String>) {
    var icecreamArray = arrayOf("vanilla ice cream", "chocolate ice cream", "sprinkles", "chocolate syrup", "cherries")
    var qty = arrayOf("2", "2", "2", "2", "2")
    var userIn = ""
    var userIn2 = 0
    var userIn3 = ""
    var add = 0
    var subtract = 0

    var combArray = arrayOf<Array<String>>()

    combArray += icecreamArray
    combArray += qty

    var rowcount = combArray[0].size - 1

    for (i in 0..rowcount) {
        var a_item = combArray[0][i]
        var a_qty = combArray[1][i]
        println("inventory: $a_item has $a_qty items")
    }
    println()
    println("would you like to edit inventory? (Y/N)")
    userIn = readLine()!!.uppercase()
    if (userIn == "Y".toString()) {
        println("which would you like to edit? (input as #)")
        println("1 - vanilla ice cream")
        println("2 - chocolate ice cream")
        println("3 - sprinkles")
        println("4 - chocolate syrup")
        println("5 - cherries")
        userIn2 = readLine()!!.toInt() - 1
        println("add or subtract inventory?")
        userIn3 = readLine()!!.toLowerCase()


        if (userIn3 == "add") {
            println("how much would you like to add?")
            add = readLine()!!.toInt()
            var a_item = combArray[0][userIn2]
            var aqty = combArray[1][userIn2].toInt()
            var a_qty2 = aqty + add
            println("inventory: $a_item now has $a_qty2 items")
            println("it previously had ${a_qty2 - add} items ")
        }
        if (userIn3 == "subtract") {
            println("how much would you like to subtract")
            subtract = readLine()!!.toInt()

            var aqty = combArray[1][userIn2].toInt()
            if (subtract > aqty) {
                println("cannot subtract more than you have :)")
            }
            else {
                var a_item = combArray[0][userIn2]
                var a_qty2 = aqty - subtract
                println("inventory: $a_item now has $a_qty2 items")
                println("it previously had ${a_qty2 + subtract} items ")
            }
        }
    }
    else{
        println("have a good day")
    }
}