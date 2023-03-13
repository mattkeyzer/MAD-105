package inheritance

/**
 * @author Matt Keyzer
 * date: mar 13 2023
 *
 */
open class Residential1 (var propertyName: String,
                        var senior: Boolean,
                       customerName: String,
                       customerPhone: String,
                       customerAddress: String,
                       squareFootage: Double
): Customer1(customerName, customerPhone, customerAddress, squareFootage) {
    fun residentialPrintAll() {
        //basic user info
        println("Hello user!")
        println("What is your name? ")
        try {
            customerName = readLine()!!.toString()
        } catch (e: Exception){
            print(e.message)
        }
        try {
            customerName = readLine()!!.toString()
        } catch (e: Exception){
            print(e.message)
        }
        println("Thank you!")
        println("What is your phone number? ")
        try {
            customerPhone = readLine()!!.toString()
        } catch (e: Exception){
            print(e.message)
        }
        println("Thank you!")
        println("Are you a senior? ")
        println("'YES' for yes 'NO' for no ")
        var seniorin = readLine()!!.toString()
        if (seniorin == "YES"){
            senior = true
        }
        if (seniorin == "NO"){
            senior = false
        }
        println("Thank you!")

        //gathering property data
        println("how many properties do you own? ")
        var propertyAmount = 0
        try {
            propertyAmount = readLine()!!.toInt()
        } catch (e: Exception){
            print(e.message)
        }
        propertyAmount == 0
        var count = 0
        count = propertyAmount
        /* adding info for array for printing to user*/
        var propertyNamesArray = arrayListOf<String>()
        var customerAddressArray = arrayListOf<String>()
        var squareFootageArray = arrayListOf<Double>()
        if (senior) {
            while (count != 0) {
                println("Please enter the name of your property: ")
                propertyName = readLine()!!.toString()
                propertyNamesArray += propertyName
                println("Thank you!")
                println("Please enter address of your property: ")
                customerAddress = readLine()!!.toString()
                customerAddressArray += customerAddress
                println("Thank you!")
                println("Please enter the square footage of your property: ")
                squareFootage = readLine()!!.toDouble()
                println("Thank you!")

                //calculating cost for building
                var commercialRate = 0.006 * squareFootage * 0.85
                squareFootageArray += commercialRate
                count -= 1
            }
        //if not senior
        } else {
            while (count != 0) {
                println("Please enter the name of your property: ")
                propertyName = readLine()!!.toString()
                propertyNamesArray += propertyName
                println("Thank you!")
                println("Please enter address of your property: ")
                customerAddress = readLine()!!.toString()
                customerAddressArray += customerAddress
                println("Thank you!")
                println("Please enter the square footage of your property: ")
                squareFootage = readLine()!!.toDouble()
                println("Thank you!")

                //calculating cost for building
                var commercialRate = 0.006 * squareFootage
                squareFootageArray += commercialRate
                count -= 1
            }
        }
        var range = 0
        for (i in propertyNamesArray) {
            range += 1
        }
        var totalcost = 0.0
        //print out to user
        println("*** Here is your receipt ***")
        println("Customer name: $customerName")
        println("Customer phone: $customerPhone")
        for (i in 0..range -1) {
            println(
                "Customer property name: ${propertyNamesArray[i]} \n" +
                        "Customer address name: ${customerAddressArray[i]} \n" +
                        "Cost for this building: $${squareFootageArray[i]}"
            )
            totalcost += squareFootageArray[i]

        }
        println("Total cost: $$totalcost")
        println("\n")
    }
}

