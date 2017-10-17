package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-18
 * Time: 00:11
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val f1 = Footballer1(13,"Cristiano","LA Galaxy")
    f1.playFootball()
}

open class Person5(age:Int,name:String)
{
}
class Footballer1(age:Int,name:String,club:String) :Person5(age,name)
{
    init
    {
        println("Football player $name of age $age and plays for $club")
    }

    fun playFootball()
    {
        println("I am playing football.")
    }

}