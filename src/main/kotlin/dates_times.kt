import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar

fun main(args: Array<String>) {
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy" )
    var today = LocalDate.now()
    var formattedToday = today.format(formatter)
    var month = Calendar.getInstance().get(Calendar.MONTH)
    println("Today is $formattedToday")

    //january
    if (month == 0){
        println("The full moon this month is on the 6th!")
        println("The full moon next month is on the 5th!")
    }
    //february
    if (month == 1){
        println("The full moon this month is on the 5th!")
        println("The full moon next month is on the 7th!")
    }
    //march
    if (month == 2){
        println("The full moon this month is on the 7th!")
        println("The full moon next month is on the 5th!")
    }
    //april
    if (month == 3){
        println("The full moon this month is on the 5th!")
        println("The full moon next month is on the 5th!")
    }
    //may
    if (month == 4){
        println("The full moon this month is on the 5th!")
        println("The full moon next month is on the 3rd!")
    }
    //june
    if (month == 5){
        println("The full moon this month is on the 3rd!")
        println("The full moon next month is also on the 3rd!")
    }
    //july
    if (month == 6){
        println("The full moon this month is on the 3rd!")
        println("There are two full moons next month! On the 1st and 30th!")
    }
    //august
    if (month == 7){
        println("There are two full moons this month! On the 1st and 30th!")
        println("The full moon next month is on the 29th!")
    }
    //september
    if (month == 8){
        println("The full moon this month is on the 29th!")
        println("The full moon next month is on the 28th!")
    }
    //october
    if (month == 9){
        println("The full moon this month is on the 28th!")
        println("The full moon next month is on the 27th!")
    }
    //november
    if (month == 10){
        println("The full moon this month is on the 27th!")
        println("The full moon next month is on the 26th!")
    }
    //december
    if (month == 11){
        println("The full moon this month is on the 26th!")
        println("The full moon next month is on the 25th!")
    }


}

