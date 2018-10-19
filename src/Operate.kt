import java.util.*

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-14
 * Time: 23:56
 * Description:
 *
 */
fun main(args: Array<String>)
{
    /**
     * Example: Arithmetic Operators
     */
    val number1 = 12.5
    val number2 = 3.5
    var result: Double
    result = number1 + number2
    println("number1 + number2 = " + result)
    result = number1 - number2
    println("number1 - number2 = " + result)
    result = number1 * number2
    println("number1 * number2 = " + result)
    result = number1/number2
    println("number1 / number2 = $result")
    result = number1 % number2
    println("number1 % number2 = $result")

    /**
     * Example: Arithmetic Operators
     */
    println("Example: Arithmetic Operators")
    val start= "I am a good coder."
    val middle = "I like code the code."
    val end = "-   Abbot"
    val res = start+middle+end
    println(res)


    /**
     * How arithmetic operators actually work?
     */
    var a = 12
    var b = 5
    val plus = a.plus(b)
    val minus = a.minus(b)
    val times = a.times(b)
    val div = a.div(b)
    val mod = a.rem(b)
    println("plus = "+plus)
    println("minus = $minus")
    println("times = $times")
    println("div = $div")
    println("mod = $mod")

    /**
     * Example: Assignment Operators
     */

    var c = 13
    var d = 3
    c *= 3
    println("c = $c")

    /**
     * Example: Unary Operators
     */

    var x = 1
    var y = true
    var z = 1
    var resu:Int
    var booleanResult:Boolean
    resu = -x
    println("-x = $resu")
    booleanResult = !y
    println("booleanREsult = $booleanResult")

    --z
    println("z = $z")

    /**
     * Comparison and Equality Operators
     */

    val m = 13
    val n = 3
    val max = if(m > n)
    {
        println("m is larger than n.")
        m
    }
    else
    {
        println("n is larger than m.")
        n
    }

    println("max = $max")


    /**
     * Logical Operators
     */

    val p = 10
    val q= 9
    val r = -1
    val okresult:Boolean
    //result is true is p is largest
    okresult = (p>q)&&(p>r)//result is p>q and p>r
    println("okresult = $okresult")



    /**
     * in Operator
     */

    val numbers = intArrayOf(1,2,3,4,5)
    if(4 in numbers)
    {
        println("numbers array contains 4.")
    }

    /**
     * Index access Operator
     */
    val array1 = intArrayOf(12,3,4,5,6)
    println(array1[1])
    array1[1] = 13
    println(array1[1])

    val compareTo = a.compareTo(b)
    println("a = $a  compareTo b = $b ="+compareTo)
    val inv = a.inv()
    println("a= $a and a.inv() inv = "+inv)


    /**
     * Kotlin Type Conversion
     */

    val x1: Int = 777755
    val x2: Long = x1.toLong()
    println("x1 =$x1")
    println("x2 =$x2")
    val x3 :Byte = x2.toByte()
    println("x3 = $x3")


    /**
     * Kotlin Expression, Statements and Blocks
     */

    val a1 = 132
    val a2 = 1322
    val max1:Int
    max1 = if(a1 > a2) a1 else a2
    println("max1 = $max1")
    println("${max1+max1+max1}")


    /*
     * Print String Entered By the User
     */
    print("Enter text:")
    val stringInput = readLine()!!
    println("You entered:$stringInput")

    /**
     * Getting Integer Input from the User
     */
    val reader = Scanner(System.`in`)
    print("Enter a number:")
    val integer :Int = reader.nextInt()
    println("integer= $integer")




}
