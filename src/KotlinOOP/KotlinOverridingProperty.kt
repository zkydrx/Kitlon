package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-18
 * Time: 00:29
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val girl = G()
    girl.age = 31
    println("My fake age is ${girl.age}")
}

open class P()
{
    open var age:Int = 0
    get() = field
    set(value)
    {
        field = value
    }
}

class G :P()
{
    override var age:Int = 0
    get() = field
    set(value)
    {
        field = value -5
    }
}