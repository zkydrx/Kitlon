package KotlinOOP.KotlinCompanionObject

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-21
 * Time: 00:39
 * Description:
 *
 */

class Y
{
    fun callMe() = println("I'm called.")
}

fun main(args: Array<String>)
{
    val p1 = Y()
    // calling callMe() method using object p1.
    p1.callMe()
    Y1.callMe()
}


/**
 * If you are familiar with Java, you may relate companion objects with static methods (even though how they work internally is totally different).
 */
class Y1
{
    // name of the companion object is omitted.
    companion object
    {
        fun callMe() = println("I'm called.")
    }
}