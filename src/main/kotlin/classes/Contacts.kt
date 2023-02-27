package classes

class contacts constructor(var employeeName: String,
                           var employeeNumber: String,
                           var employeeShift: Int){
    init {
        println("New Contact added for: $employeeName")
    }

    fun printAll(){
        println("Name: $employeeName")
        println()
        println("Number: $employeeNumber")
        println()
        println("Shift: $employeeShift")

    }
}