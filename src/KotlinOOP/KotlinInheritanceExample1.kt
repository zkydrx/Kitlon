package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-18
 * Time: 00:18
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val p1 = AuthLog1("Bad Password")
}

open class Log1
{
    var data:String=""
    var numberOfData = 0
    constructor(_data:String)
    {
    }
    constructor(_data:String,_numberOfData:Int)
    {
        data = _data
        numberOfData = _numberOfData
        println("$data:$numberOfData times")
    }

}

class AuthLog1:Log1
{
    constructor(_data:String):this("From AuthLog ->+$_data",10)
    {}

    constructor(_data: String,_numberOfData: Int):super(_data,_numberOfData)
    {

    }
}
