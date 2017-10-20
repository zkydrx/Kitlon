package KotlinOOP.KotlinOperatorOverloading

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-21
 * Time: 00:49
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val a = 5
    val b = 10
    println(a.plus(b))

    val p1 = Point(3,-8)
    val p2 = Point(2,9)
    var sum = Point()
    sum = p1+p2
    println("sum = (${sum.x},${sum.y})")


    var point12 = Point12(3,-8)
    --point12
    println("Point = (${point12.x},${point12.y})")


    val pp = Point13(3,-8)
    val pp1 = Point13(2,9)

    var sums = Point13()

    sums = pp +pp1

    println("sums = (${sums.x},${sums.y})")

}

class Point(val x:Int =0,val y:Int = 10)
{
    operator fun plus(p:Point):Point
    {
        return Point(x+p.x,y+p.y)
    }
}

class Point12(var x:Int = 0,var y:Int = 10)
{
    operator fun dec() = Point12(--x,--y)
}

class Point13(var x:Int =0,val y:Int = 10)
{
    operator fun plus(P:Point13) = Point13(x - P.x,y -P.y)
}