package KotlinFunctions

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 09:13
 * Description:
 * Kotlin Functions
 */
fun main(args: Array<String>)
{
    callMe()
    println("Printing outside from callMe() function")

    val number1 = 12.2
    val number2 = 3.4
    val result :Int
    result = addNumbers(number1,number2)
    println("result = $result")


    println(getName("John","Doe"))
    println(getName1("John","Doe"))
    println(getInt("123456"))
    println(getLong(23456))
}

fun callMe()
{
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}

fun addNumbers(n1:Double,n2:Double):Int
{
    val sum = n1+n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun getName(firstName:String,lastName:String):String = "$firstName $lastName"

fun getName1 (firstName: String,lastName: String):String
{
    return "$firstName $lastName"
}

fun getInt(yes: String): Int
{
    return yes.toInt()
}

fun getLong(a:Int):Long
{
    return a.toLong()
}


