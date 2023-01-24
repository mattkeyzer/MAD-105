fun main(args: Array<String>) {
    var a = 2
    var b = 3

    var ans1 = a - b
    println("The equation 2 - 3 = $ans1 ")

    var ans2 = a > b
    println("The equation 2 > 3 is $ans2")

    var ans3 = a * b
    println("The equation 2 * 3 = $ans3")

    a++

    var ans4 = a == b
    println("The equation 3 = 3 is $ans4")

    a += 7
    println("The equation 3 + 7 is $a")
}