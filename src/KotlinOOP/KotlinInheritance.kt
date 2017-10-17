package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 23:45
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val t1 = MathTeacher(25,"Jack")
    println("*******************")
    t1.teachMaths()

    println()
    val f1 = Footballer(29,"Christiano")
    f1.playFootball()
}

open class  Persons(age:Int,name:String)
{
    init
    {
        println("My name is $name")
        println("My age is $age")
    }
}

class MathTeacher(age:Int,name:String):Persons(age,name)
{
    fun teachMaths()
    {
        println("I teach in primary school.")
    }
}

class  Footballer(age:Int,name:String) :Persons(age,name)
{
    fun playFootball()
    {
        println("I play for LA Galaxy.")
    }
}

