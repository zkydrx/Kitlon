package KotlinOOP.KotlinDataClass

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-19
 * Time: 01:30
 * Description:
 *
 */
data class User(val name: String, val age: Int)

data class User1(val name:String,val age:Int,val gender:String)
/**
 * When you declare a data class, the compiler automatically generates several functions such as toString(), equals(), hashcode() etc behind the scenes. This helps to keep you code concise. Had you used Java, you would need to write a lot of boilerplate code.
 */
fun main(args: Array<String>)
{
    val jack = User("jack", 20)


    println("name = ${jack.name}")
    println("age = ${jack.age}")
    val u1= User("John",20)
    val u2 = u1.copy(name = "Randy")
    val u3 = u1.copy(name = "Amanda")

    println("u1:name = ${u1.name},age = ${u1.age}")
    println("u2:name = ${u2.name},age = ${u2.age}")

    println(u1.toString())

    println("u1 hashcode = ${u1.hashCode()}")
    println("u2 hashcode = ${u2.hashCode()}")
    println("u3 hashcode = ${u3.hashCode()}")


    if(u1.equals(u2) == true)
    {
        println("u1 is equal to u2.")
    }
    else
    {
        println("u1 is not equal to u2.")
    }

    if(u1.equals(u3)== true)
    {
        println("u1 is equal to u3.")
    }
    else
    {
        println("u1 is not equal to u3.")
    }

    val u4 = User1("John",20,"Male")
    val (name,age,gender) = u4
    println("name = $name")
    println("age = $age")
    println("gender = $gender")

    /**
     * This was possible because the compiler generates componentN() functions all properties for a data class. For example:
     */
    println(u4.component1())
    println(u4.component2())
    println(u4.component3())
}