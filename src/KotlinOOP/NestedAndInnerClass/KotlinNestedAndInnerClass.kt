package KotlinOOP.NestedAndInnerClass

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-19
 * Time: 01:18
 * Description:
 * Kotlin Nested and Inner Class
 */

class Outer
{
    val a = "Outside Nested class."
    class Nested
    {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class"
    }

}

fun main(args: Array<String>)
{
    // accessing member of Nested class
    println(Outer.Nested().b)

    //creating object of Nested class
    val nested = Outer.Nested()

    println(nested.callMe())
}