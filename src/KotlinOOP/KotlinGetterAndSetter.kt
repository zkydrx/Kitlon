package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 15:48
 * Description:
 * Kotlin Getters and Setters
 */


fun main(args: Array<String>)
{

    val p = Person3()
    p.name = "jack"
    println("${p.name}")
    val p1 = Person4()
    p1.name = "Kotlin"
    println("${p1.name}")


    val  maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria:Pretended age = ${maria.age}")


    val angela = Girl()

    angela.actualAge = 35

    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")
}

class Person3
{
    var name: String = "defaultValue"
        get() = field
        set(value)
        {
            field = value
        }
}

class Person4
{
    var name: String = "zkyzky"
}

class Girl
{
    var age: Int = 0
        get() = field
        set(value)
        {
            field = if (value < 18)
            {
                18
            }
            else if (value >= 18 && value <= 30)
            {
                value
            }
            else
            {
                value - 3
            }
        }
    var actualAge:Int = 0
}
