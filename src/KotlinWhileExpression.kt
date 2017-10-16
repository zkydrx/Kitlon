/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-16
 * Time: 18:54
 * Description:
 * Kotlin while and do...while Loop
 */
fun main(args: Array<String>)
{
    var boo = 1
    while (boo <=6)
    {
        println("$boo")
        ++boo
    }
    var sum = 0
    var i = 100
    while (i != 0)
    {
        sum += i
        i--
    }
    println("sum = $sum")

    var su:Int = 0
    var input:String
    do
    {
        print("Enter an integer:")
        input = readLine()!!
        su += input.toInt()
    }while (input != "0")
    println("su = $su")


}