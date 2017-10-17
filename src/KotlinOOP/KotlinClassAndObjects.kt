package KotlinOOP

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-17
 * Time: 15:05
 * Description:
 *
 */
fun main(args: Array<String>)
{
    val lamp = Lamp()
    val l1 = Lamp()
    val l2 = Lamp()

    l1.turnOn()
    l2.turnOff()
    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
    lamp.displayLightStatus()
}

class Lamp
{
    // property (data meber)
    private var isOn:Boolean = false

    //member function
    fun turnOn()
    {
        isOn = true
    }

    // member function
    fun turnOff()
    {
        isOn = false
    }



    fun displayLightStatus(lamp:String)
    {
        if(isOn == true)
        {
            println("$lamp lamp is on.")
        }
        else
        {
            println("$lamp lamp is off.")
        }
    }

    fun displayLightStatus()
    {
        if(isOn == true)
        {
            println("lamp is on.")
        }
        else
        {
            println("lamp is off.")
        }
    }
}