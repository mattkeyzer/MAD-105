import kotlin.math.abs

fun main() {
    var temperature = 0F
    val low = 97.5F
    val normal = 99.5F

    print ("What is the temperature?")
    temperature = readLine()!!.toFloat()
    if (temperature < low)
        println("The temperature is $temperature, that's low")
    else if (temperature <= normal)
        println("The temperature is $temperature, that's normal")
    else
        println("The temperature is $temperature, that's hot")
}