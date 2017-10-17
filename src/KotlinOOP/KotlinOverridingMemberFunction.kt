package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-18
 * Time: 00:24
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val girl = Gir()
    girl.displayAge(31)
}

open class Per()
{
    open fun displayAge(age:Int)
    {
        println("My age is $age.")
    }
}

class Gir:Per()
{
    override fun displayAge(age: Int)
    {
        println("My fake age is ${age-5}")
    }
}

