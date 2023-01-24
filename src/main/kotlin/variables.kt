fun main(args: Array<String>) {
    var myByte: Byte = 7
    var myShort: Short = 9
    var myInt: Int = 10
    var myLong: Long = 40
    var myFloat: Float = 3.14F
    var myDouble: Double = 27.2727272727
    var myBoolean: Boolean = true
    var myChar: Char = 'a'

    var multiLines = """
        $myByte is a Byte
        $myShort is a Short
        $myInt is an Integer
        $myLong is a Long
        $myShort is a Short
        $myFloat is a Float
        $myDouble is a Double
        $myBoolean is a Boolean
        $myChar is a Character (char)
    """.trimIndent()

    print(multiLines)



}