package inheritance
/**
 * @author Matt Keyzer
 * date: mar 6 2023
 *
 */

//Customer class set up
open class Customer (customerName: String,
                     customerPhone: String,
                     customerAddress: String,
                     squareFootage: Double){
    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerPhone: String = ""
        get() = field
        set(value) {
            field = value
        }

    var customerAddress: String = ""
        get() = field
        set(value) {
            field = value
        }

    var squareFootage: Double = 0.0
        get() = field
        set(value) {
            field = value
        }


    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage

    }
}