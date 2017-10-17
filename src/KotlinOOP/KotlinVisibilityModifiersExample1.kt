package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-18
 * Time: 00:43
 * Description:
 *
 */

open class Base()
{
    var a = 1
    private var b = 2
    protected open val c = 3
    internal val d = 4
    protected fun e()
    {

    }

}

class Derived:Base()
{
    // a,c,d and e() of the Base class are visible
    // b is not visible

    override  val c = 9
}
fun main(args:Array<String>)
{
    val base = Base()
    base.a
    base.d

    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    //derived.c is not visible.
}

