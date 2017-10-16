/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-16
 * Time: 17:00
 * Description:
 * Kotlin Variables and Basic Types
 */

fun main(args: Array<String>)
{
    val language = "French"
    val score = 98
    val languages: String = "French"
    val scores: Int = 98

    val languages1: String//variable declaration of type String
    languages1 = "French" // variable initialization

    val scores1: Int // variable declaration of type int
    scores1 = 98//variable initialization


    /**
     *
     * Difference Between var and val

    val (Immutable reference) - The variable declared using val keyword cannot be changed once the value is assigned. It is similar to final variable in Java.
    var (Mutable reference) - The variable declared using var keyword can be changed later in the program. It corresponds to regular Java variable.

    Here are few examples:
     */
    val lang = "French"
//    lang = "zky"// don't be change like final static
    var lang1 = "French"// can change.
    lang1 = "zky"

    val ran = 111
//    ran = 123
    var ra = 111
    ra = 123

    val range:Byte =112
    println("$range")

    val tem:Short =-11245
    println("$tem")

    val score11:Int = 10000
    println("$score11")
    val score111 = 10
    println("$score111")
    val high:Long = 9999
    println("$high")
    val high1 = 8888L
    val distance = 999.33
    println("$distance")
    val distances = 19.33F
    println("$distances")
    var test:Number = 111
    println("$test")
    test = 1333
    println("$test")
    test = 123.333F
    println("$test")
    test = 1000L
    println("$test")


    val letter: Char
    letter = 'z'
    println("$letter")
    val flag =true
    println("$flag")
}