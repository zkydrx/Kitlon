/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-16
 * Time: 19:01
 * Description:
 * Kotlin for Loop
 */

fun main(args: Array<String>)
{
    for (i in 1..1000)
    {
        println("$i * $i = ${i*i}")
    }

    for (i in 1..100) println(i)

    print("for (i in 1..5) println(i) =")
    for (i in 1..5) print(i)
    println()

    print("for (i in 5..1) println(i) =")
    for (i in 5..1) print(i)
    println()


    print("for(i in 5 downTo 1 ) = ")
    for (i in 5 downTo 1) print(i)
    println()

    print("for(i in 1..6 step 2) print(i)")
    for (i in 1..6 step 2) print(i)
    println()
    print("for(i in 5 downTo 1 step 2 ) print(i)")
    for (i in 5 downTo 1 step 2) print(i)
    println()


    var languages = arrayOf("Ruby","Kotlin","Python","Java")
    for (i in languages)
    {
        println(i)
    }

    println("--------------------------------")
    for (i in languages.indices)
    {
        if(i % 2 == 0)
        {
            println(languages[i])
        }
    }


    var text ="Kotlin"
    for (letter in text)
    {
        println(letter)
    }

    println("----------------------------")

    for (item in text.indices)
    {
        println("$item "+text[item])
    }
}