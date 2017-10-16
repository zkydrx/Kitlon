import java.math.BigInteger

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-16
 * Time: 19:20
 * Description:
 * Kotlin Recursion (Recursive Function) and Tail Recursion
 */
fun main(args: Array<String>)
{
    val number =4
    val result:Long
    result=recurse(4)
    println("Factorial of $number = $result")
    val n = 100
    val f = BigInteger("0")
    val s = BigInteger("1")
    val fibonacci = fibonacci(n, f, s)
    println(fibonacci)

    val num = 5
    val factorial = factorial(num)
    println(factorial)




}

fun recurse(n :Int) :Long
{
    return if(n ==1) n.toLong() else n* recurse(n-1)
}

tailrec fun fibonacci(n:Int,a:BigInteger,b:BigInteger):BigInteger
{
    return if( n == 0) a else fibonacci(n-1,b,a+b)
}


tailrec fun factorial(n:Int,run:Int =1):Long
{
    return if(n ==1) run.toLong() else factorial(n-1,run*n)
}