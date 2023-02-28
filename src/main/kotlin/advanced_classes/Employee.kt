package advanced_classes

class Employee constructor(var name: String,
                           var position: String,
                           var salary: Boolean,
                           var payRate: Double,
                           var shift: Int) {


    fun printAll() {
        println("Name: $name")
        println("Position: $position")
        println("Salary: $salary")
        println("Payrate:" + " $" + String.format("%.2f", payRate))
        println("Shift: $shift")

    }

    fun calculate(hoursIn: Double) {
        //hourly
        if (!salary) {
            if (shift == 1){
                if (hoursIn > 40){
                    payRate = payRate * 1.00
                    var overtime = hoursIn - 40
                    overtime *= 1.5
                    var regularPay = 40
                    var income = overtime + regularPay
                    var totalIncome = income * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
                else{
                    payRate = payRate * 1.00
                    var totalIncome = hoursIn * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
            }
            if (shift == 2) {
                if (hoursIn > 40){
                    payRate = payRate * 1.05
                    var overtime = hoursIn - 40
                    overtime *= 1.5
                    var regularPay = 40
                    var income = overtime + regularPay
                    var totalIncome = income * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
                else{
                    payRate = payRate * 1.05
                    var totalIncome = hoursIn * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
            }
            if (shift == 3) {
                if (hoursIn > 40){
                    payRate = payRate * 1.10
                    var overtime = hoursIn - 40
                    overtime *= 1.5
                    var regularPay = 40
                    var income = overtime + regularPay
                    var totalIncome = income * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
                else{
                    payRate = payRate * 1.10
                    var totalIncome = hoursIn * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
            }
        }
        else {

            //salaried
            if (shift == 1){
                if (hoursIn > 40){
                    var hoursIn = 40
                    payRate = payRate * 1.00
                    var overtime = hoursIn - 40
                    var regularPay = 40
                    var income = overtime + regularPay
                    var totalIncome = income * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
                else{
                    payRate = payRate * 1.00
                    var totalIncome = hoursIn * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
            }
            if (shift == 2){
                if (hoursIn > 40){
                    var hoursIn = 40
                    payRate = payRate * 1.05
                    var overtime = hoursIn - 40
                    var regularPay = 40
                    var income = overtime + regularPay
                    var totalIncome = income * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
                else{
                    payRate = payRate * 1.05
                    var totalIncome = hoursIn * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
            }
            if (shift == 3){
                if (hoursIn > 40){
                    var hoursIn = 40
                    payRate = payRate * 1.10
                    var overtime = hoursIn - 40
                    var regularPay = 40
                    var income = overtime + regularPay
                    var totalIncome = income * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
                else{
                    payRate = payRate * 1.10
                    var totalIncome = hoursIn * payRate
                    println("Income for this week is:"  + " $" + String.format("%.2f",totalIncome))
                }
            }

        }
    }
}
