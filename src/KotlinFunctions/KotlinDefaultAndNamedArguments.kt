package KotlinFunctions

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 14:50
 * Description:
 *  Kotlin Default and Named Arguments
 */

fun main(args: Array<String>)
{
    foo()
    foo('x',2)
    foo('y')

    println("Output when no argument is passed:")
    displayBorder()

    println("\n\n'*' is used as a first argument." )
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\n'*' is used as first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder('*',5)

    println()
    displayBorder(length = 5)
}

fun foo(letter:Char = 'a',number:Int = 15)
{
    println(letter +"::::"+ number)
}

fun displayBorder(character:Char = '=',length:Int = 15)
{
    for (i in 1..length)
    {
        print(character)
    }
}