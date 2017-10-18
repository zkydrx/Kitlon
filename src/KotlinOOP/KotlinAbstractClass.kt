package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-19
 * Time: 00:45
 * Description:
 * Kotlin Abstract Class.
 */

abstract class AA(name:String)
{
    init
    {
        println("My name is $name")
    }
    var age:Int = 40
    fun displaySSN(ssn:Int)
    {
        println("My SSN is $ssn")
    }

    abstract fun displayJob(description:String)
}

class TT(name:String):AA(name)
{
    override fun displayJob(description: String)
    {
        println(description)
    }
}

fun main(args:Array<String>)
{
    val jack = TT("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}