package KotlinFunctions

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 14:41
 * Description:
 * Kotlin Infix Function Call
 */
fun main(args: Array<String>)
{
    val a = true
    val b = false
    var result:Boolean

    result = a or b
    println("result = $result")

    result = a and b
    println("result = $result")

    val p = Structure()
    p createPyramid 4

}

class Structure()
{
    infix fun createPyramid(rows:Int)
    {
        var k = 0
        for(i in 1..rows)
        {
            k = 0
            for (space in 1..rows-i)
            {
                print("  ")
            }
            while (k != 2*i - 1)
            {
                print("* ")
                ++k
            }
            println()
        }
    }
}