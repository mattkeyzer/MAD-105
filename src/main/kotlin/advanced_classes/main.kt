package advanced_classes

fun main(args: Array<String>) {
    var person1 = Employee("Matt Keyzer", goPosition(PositionTitle.ADMINISTRATION), true, 27.0, 1)
    var person2 = Employee("Mom Keyzer", goPosition(PositionTitle.ADMINISTRATION), false, 22.0, 2)
    var person3 = Employee("Dad Keyzer", goPosition(PositionTitle.ADMINISTRATION), false, 21.0, 3)


    person1.printAll()
    person1.calculate(45.0)
    println()
    person2.printAll()
    person2.calculate(50.0)
    println()
    person3.printAll()
    person3.calculate(35.0)
}

fun goPosition(go:PositionTitle): String{
    when (go) {
        PositionTitle.ADMINISTRATION -> return "administration"
        PositionTitle.PRODUCTION -> return "production"
        PositionTitle.SALES -> return "sales"
        PositionTitle.MAINTENANCE -> return "maintenance"
        PositionTitle.TECHNICAL -> return "technical"
        PositionTitle.SECRETARIAL -> return "secretarial"
        else -> return "no job"
    }
}

fun calculate(){

}