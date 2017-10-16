/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-16
 * Time: 16:18
 * Description:
 * Kotlin when Expression
 *
 */
fun main(args: Array<String>)
{
    val a = 12
    val b = 5
    println("Enter operator either +,-,* or /")
    val operator=  readLine()
    val result= when(operator)
    {
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        "/" -> a/b
        else -> "$operator operator is invalid operator."
    }
    println("result = $result")
    println("Enter operator either +,-,* or /")
    val oper = readLine()
    when(oper)
    {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a -b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
    }

    val n = -1
    when (n)
    {
        1,2,3 -> println(" n is  a positive integer less than 4")
        0 -> println("n is zero")
        -1,-2 -> println("n is a negative integer greater than -3.");
    }

    val x = 100
    when (x)
    {
        in 1..10 -> println(" A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100(inclusive)")
    }

    /**
     * Check if a value is of a particular type.

    To check whether a value is of a particular type in runtime, we can use is and !is operator. For example,
     */
    /*val aaa:Int
    when (aaa)
    {
        is Int -> print(x+1)
        is String -> print(aaa.length+1)
        is IntArray -> print(aaa.sum())
    }*/

    val m = 11
    val m1= "11"
    when(m1)
    {
        "cat" -> println("Cat? Really?")
        12.toString() -> println(" Close but not close enough")
        m.toString() -> println("Bingo! It's eleven.")
    }
}