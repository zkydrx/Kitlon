package KotlinOOP.KotlinObject

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-21
 * Time: 00:21
 * Description:
 * Kotlin Object Declarations and Expressions
 */


object Test
{
    private var a:Int= 0
    var b: Int = 1
    fun makeMe12():Int
    {
        a = 12
        return a
    }
}

fun main(args: Array<String>)
{
    val result: Int
    result = Test.makeMe12()
    println("b = ${Test.b}")
    println("result = $result")

    val atheist = object :XX()
    {
        override fun pray()
        {
            println("I don't pray, I am an atheist.")
        }
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()


    val athists = object :XXX("Jack",29)
    {
        override fun pray()
        {
            println("I don't pray.I am an atheist.")
        }
    }

    athists.eat()
    athists.talk()
    athists.pray()
}


open class XX()
{
    fun eat() = println("Eating food.")

    fun talk() = println("Talking with people")

    open fun pray() = println("Praying god.")


}

open class XXX(name:String,age:Int)
{
    init
    {
        println("name:$name,age:$age")

    }

    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")

    open fun pray() = println("Praying god.")
}
