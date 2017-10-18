package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-19
 * Time: 00:57
 * Description:
 * Kotlin Interfaces
 */

fun main(args: Array<String>)
{
    val obj = InterfactImp()
    println("test = ${obj.test}")
    println("Calling hello():")
    obj.hello()
    println("Calling and printing foo():")
    println(obj.foo())

    val obj1 = Child()
    obj1.callMe()
    obj1.callMeToo()

    val obj2 = Child1()
    obj2.callMe()

}

interface MyInterface
{
    val test: Int
    fun foo(): String
    fun hello()
    {
        println("Hello there,pal!")
    }
}

class InterfactImp : MyInterface
{
    override val test: Int = 25
    override fun foo() = "Lol"
}


interface AAA
{
    fun callMe()
    {
        println("From interface A")
    }
}

interface BBB
{
    fun callMeToo()
    {
        println("From interface B")
    }
}

interface CCC
{
    fun callMe()
    {
        println("From interface C")
    }
}

class Child:AAA,BBB

class Child1:AAA,CCC
{
    override fun callMe()
    {
        super<AAA>.callMe()
        super<CCC>.callMe()
    }
}