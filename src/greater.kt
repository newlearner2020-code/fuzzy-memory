import java.util.*
fun main()
{

    val b1=Scanner(System.`in`)
    val b=b1.nextInt()
    val c1=Scanner(System.`in`)
    val c=c1.nextInt()
    val res=greaterone(a,b,c)
    print("the greater value is :-$res")
}

fun greaterone(x:Int,y:Int,z:Int): Any {
if((x>y)&&(x>z))
    {
    return x
    }
    else if((y>x)&&(y>z))
   {
   return y
   }
    else
    {
    return z
    }

}
