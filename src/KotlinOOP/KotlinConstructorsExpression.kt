package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 15:25
 * Description:
 * Kotlin Constructors
 */

fun main(args: Array<String>)
{
    val person1 = Person("Joe",25)
    println("Frist Name = ${person1.firstName}")
    println("Age = ${person1.age}")
    val pers = Person1("zky", 25)

}


class Person(val firstName:String, var age:Int)
{
}

class Person1(fName:String, personAge:Int)
{
    val firstName:String
    var age :Int
    init
    {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}

class Person2(fName:String,personAge:Int)
{
    val firstName = fName.capitalize()
    var age = personAge

    init
    {
        println("First Name = $firstName")
        println("Age= $age")
    }
}
