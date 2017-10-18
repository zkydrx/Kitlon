package KotlinOOP.NestedAndInnerClass

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-19
 * Time: 01:24
 * Description:
 *
 */
class Outera
{
    val a = "Outside Nested class."
    inner class Inner
    {
        fun callMe() =a
    }
}

fun main(args: Array<String>)
{
    val outer = Outera()
    println("Using outer object:${outer.Inner().callMe()}")

    val inner = Outera().Inner()
    println("Using inner object:${inner.callMe()}")
}