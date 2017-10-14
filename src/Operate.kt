/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-14
 * Time: 23:56
 * Description:
 *
 */
fun main(args: Array<String>)
{
    /**
     * Example: Arithmetic Operators
     */
    val number1 = 12.5
    val number2 = 3.5
    var result: Double
    result = number1 + number2
    println("number1 + number2 = " + result)
    result = number1 - number2
    println("number1 - number2 = " + result)
    result = number1 * number2
    println("number1 * number2 = " + result)
    result = number1/number2
    println("number1 / number2 = $result")
    result = number1 % number2
    println("number1 % number2 = $result")

    /**
     * Example: Arithmetic Operators
     */
    println("Example: Arithmetic Operators")
    val start= "I am a good coder."
    val middle = "I like code the code."
    val end = "-   Abbot"
    val res = start+middle+end
    println(res)
}
