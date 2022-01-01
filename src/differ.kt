import java.util.*
fun main()
{
    val a1=Scanner(System.`in`)
    val a=a1.nextFloat()
     flow(a)

}

fun flow(num1:Float): Float
{
    if(num1>1&&num1<1000000)
    {
        print("$num1 is +Ve")

    }
    else if(num1>1000000)
    {
        print("$num1 is large")

    }
   else if(num1>0&&num1<2)
      {
        print("$num1 is small")
       }
    else if(num1<0)
    {
        print("$num1 is -ve")
    }
    else
    {
        print("zero")
    }
    return num1

}
