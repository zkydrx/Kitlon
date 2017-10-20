package KotlinOOP.KotlinSealedClass

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 10/20/17
 * Time: 2:43 AM
 * Description:
 * Kotlin Sealed Classes
 */
fun main(args: Array<String>)
{

}

//class Expr
//class Const(val value:Int) :Expr
//class Sum(val left:Expr,val right:Expr):Expr
//fun eval(e:Expr):Int =
//        when(e)
//        {
//            is Const ->e.value
//            is Sum ->eval(e.right) + eval(e.left)
//            else ->
//                    throw IllegalArgumentException("Unknown expression")
//        }


//sealed class Expr
//class Const(val value:Int):Expr()
//class Sum(val left:Expr,val right:Expr):Expr()
//object NotAnumber:Expr()
//
//fun eval(e:Expr) :Int =
//        when(e)
//        {
//            is Const ->e.value
//            is Sum -> eval(e.right) + eval(e.left)
//            NotAnumber -> java.lang.Double.NaN
//        }