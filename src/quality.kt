
import box
fun  main()
{
    val box1=box()
    println("heigh:${box1.length}")
    println("volume:${box1.volume}")
    //here the box value is printed "hello this is box" on the screen if the value of boxname is less then 3 then
    //default value will run with a message "value is less then 3
box1.boxname="hello this is box"
    println("name:${box1.boxname}")

}