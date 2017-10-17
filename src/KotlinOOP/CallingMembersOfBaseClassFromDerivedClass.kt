package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-18
 * Time: 00:33
 * Description:
 * Calling Members of Base Class from Derived Classb
 */
fun main(args: Array<String>)
{
    val girl = G1()
    girl.displayAge(31)
}

open class P1()
{
    open fun displayAge(age:Int)
    {
        println("My actual age is $age")
    }
}

class G1:P1()
{
    override fun displayAge(age: Int)
    {
        // calling function fo base class
        super.displayAge(age)
        println("My fake age is ${age-5}")
    }
}