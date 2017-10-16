/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-16
 * Time: 01:34
 * Description:
 * Kotlin if Expression
 */
fun main(args: Array<String>)
{
    val number =1
    if(number > 0)
    {
        println("Positive number.")
    }
    else
    {
        println("Negative number.")
    }

    val result = if(number > 0) "Positive number." else "Negative number."
    println("reslut = $result")

    val re= if(number > 0)
    {
        println("Positive number.")
        "Positive number"
    }
    else if(number < 0)
    {
        println("Negative number")
        "Negative number"
    }
    else
    {
        println("Zero")
        "Zero"
    }
    println("re = $re")

}